package Task2;

import java.sql.*;

public class Select_query {
    public static void main(String[] args){
        try {
            String driver = "oracle.jdbc.OracleDriver";
            Class.forName(driver);
            String url ="jdbc:Oracle:thin:@localhost:1521:XE";
            String user = "system";
            String pass = "12345";
            String selectqry="select * from student";
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement ps = con.prepareStatement(selectqry);
            ResultSet rs= ps.executeQuery(selectqry);
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int age= rs.getInt("age");
                String email=rs.getString("email");
                String mobile=rs.getString("mobile");
                System.out.println(id + " | " + name + " | " + age + " | " + email +
                        " | " + mobile);

            }
           con.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e){
            System.out.println(e.getStackTrace());
        }

    }
}
