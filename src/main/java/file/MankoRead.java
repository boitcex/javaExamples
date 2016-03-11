package file;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * Created by Roman on 16.11.2015.
 */
public class MankoRead {
    public static void main(String[] args) {

    }


        public static void copyFile(String strSource, String strDestination, String buffer) {
            int buffInit = 0;
            if (buffer == null || buffer.isEmpty()) {
                copyFile(strSource, strDestination);
            } else {
                File source = new File(strSource);
                File destination = new File(strDestination);
                if (!source.isFile() || strSource.isEmpty()) {
                    throw new IllegalArgumentException("arg[0] is not a File");
                }
                if (destination.isDirectory() || strDestination.isEmpty()) {
                    throw new IllegalArgumentException("arg[1] is not a File");
                }
                System.out.println("Start copy...");
                try (FileInputStream is = new FileInputStream(source);
                     FileOutputStream os = new FileOutputStream(destination)) {
                    byte[] byteBuff = new byte[buffInit(buffer)];
                    int length;
                    try {
                        while ((length = is.read(byteBuff)) != -1) {
                            os.write(byteBuff, 0, length);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Copy from " + source.getAbsolutePath()
                        + ", in " + destination.getAbsolutePath() + " finish");
            }
        }

    private static int buffInit(String buffer) {
        if (buffer.length() == 1) {
            if (buffer.equalsIgnoreCase("B")) {
                return 1024;
            }
        } else if (buffer.length() >= 1) {
            String firstLetter = buffer.substring(0, 1);
            if (firstLetter.equalsIgnoreCase("B")) {
                int result = Integer.parseInt(buffer.substring(1,
                        buffer.length()));
                if (result > 0)
                    return result;
            }
        }
        return 1;
    }

    public static void copyFile(String strSource, String strDestination) {

        File source = new File(strSource);
        File destination = new File(strDestination);

        if (!source.isFile() || strSource.isEmpty()) {
            throw new IllegalArgumentException("arg[0] is not a File");
        }
        if (destination.isDirectory() || strDestination.isEmpty()) {
            throw new IllegalArgumentException("arg[1] is not a File");
        }
        System.out.println("Start copy...");
        try (FileInputStream is = new FileInputStream(source);
             FileOutputStream os = new FileOutputStream(destination)) {
            try {
                int length;
                while ((length = is.read()) != -1) {
                    os.write(length);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Copy from " + source.getAbsolutePath() + ", in "
                + destination.getAbsolutePath() + " finish");
    }




    public static void copyNIO(String strSource, String strDestination) {
        File source = new File(strSource);
        File destination = new File(strDestination);

        if (source.isDirectory() || strSource.isEmpty()) {
            throw new IllegalArgumentException("arg[0] is not a File");
        }
        if (destination.isDirectory() || strDestination.isEmpty()) {
            throw new IllegalArgumentException("arg[1] is not a File");
        }
        System.out.println("Start copy....");

        try (FileChannel destChannel = new FileOutputStream(destination)
                .getChannel();
             FileChannel sourceChannel = new FileInputStream(source)
                     .getChannel();) {
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Copy from " + source + ", in " + destination
                + " finish");

    }

    public static void copyForJava7(String strSource, String strDestination)
            throws IOException {
        File source = new File(strSource);
        File destination = new File(strDestination);

        if (source.isDirectory() || strSource.isEmpty()) {
            throw new IllegalArgumentException("arg[0] is not a File");
        }
        if (destination.isDirectory() || strDestination.isEmpty()) {
            throw new IllegalArgumentException("arg[1] is not a File");
        }
        Files.copy(source.toPath(), destination.toPath());
    }
}

   /* public void readWriteFile(String strSource, String strDestination) {
        try (BufferedReader br = new BufferedReader(new FileReader(strSource));
             BufferedWriter bw = new BufferedWriter(new FileWriter(strDestination))) {
            String result = "";
            log.info("Start");
            String line = br.readLine();
            while (line != null) {
                result = getResultInvokeMethod(line);
                bw.write(result + "\n");
                line = br.readLine();
            }
            log.info("Finish");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

}*/
