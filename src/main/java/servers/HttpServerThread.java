package servers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.net.HttpURLConnection.HTTP_OK;

public final class HttpServerThread {
    public static void main(String[] args) throws IOException {
        final InetSocketAddress addr;
        final HttpServer server;
        addr = new InetSocketAddress(8989);
        server = HttpServer.create(addr, 10);
        server.createContext("/", new EchoHandler());
        server.start();
    }
}

class EchoHandler implements HttpHandler {
    private ExecutorService pool = Executors.newCachedThreadPool();

    public void handle( final HttpExchange t ) throws IOException {
        pool.submit( new Runnable() {

            public void run() {
                try {
                    final InputStream is;
                    final OutputStream os;
                    StringBuilder buf;
                    int b;
                    final String request, response;

                    buf = new StringBuilder();

                    is = t.getRequestBody();

                    while ( (b = is.read()) != -1 ) {
                        buf.append( (char) b );
                    }

                    is.close();

                    if ( buf.length() > 0 ) {
                        request = URLDecoder.decode( buf.toString(), "UTF-8" );
                    } else {
                        request = null;
                    }

                    response = request;

                    t.sendResponseHeaders( HTTP_OK, response.length() );

                    os = t.getResponseBody();

                    os.write( response.getBytes() );

                    os.close();
                    t.close();
                } catch ( Exception ex ) {
                    //System.err.println( ex.toString() );
                }
            }
        } );
    }
}