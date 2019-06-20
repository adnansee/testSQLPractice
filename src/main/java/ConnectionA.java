import java.sql.*;

public class ConnectionA {


    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/beers_db";
        String user = "root";
        String pwd = "";
        try {
            Connection c = DriverManager.getConnection(url, user, pwd);
            PreparedStatement p = c.prepareStatement("SELECT * FROM beers WHERE Alcohol > ?");
            p.setInt(1, 10);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }





        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
