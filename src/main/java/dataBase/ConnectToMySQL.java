package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by Roman on 19.11.2015.
 */
public class ConnectToMySQL {
    public static void main(String[] args) throws Exception {
        Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();

        Connection con = DriverManager.getConnection("jdbc:jtds:sqlserver://vm-sdo-app5.sdo.it.loc:1433/Prometey4", "loader_lms", "Hdn58_Trm65_p0");

        java.sql.Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Properties where login = 'ii005999iii'");

            while (rs.next()) {
                System.out.println();
                System.out.print(rs.getInt("ID")+"  ");
                System.out.println(rs.getString("Login"));
            }
    }

}
