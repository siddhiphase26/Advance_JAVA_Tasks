package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB_Connection {
    public static Connection getDB_Connection() throws Exception{
        Connection con=null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

            String url = "jdbc:Oracle:thin:@localhost:1521:XE";
            String user = "system";
            String pass = "12345";

            con = DriverManager.getConnection(url,user,pass);
            Statement st= con.createStatement();
            System.out.println("DB Connected");
            return con;
        }
    }

