import java.sql.*;

public class MainUsers {

    static String url = "jdbc:mysql://localhost:3306/slt?serverTimezone=UTC&autoReconnect=true&useSSL=false";
    static String username = "root";
    static String password = "Boser11Boh.";

    public static void main(String[] args) throws ClassNotFoundException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS Users");
            statement.executeUpdate("create table Users(id INT not null AUTO_INCREMENT, name CHAR(30) not null, password CHAR(30) not null, PRIMARY KEY (id));");
            statement.executeUpdate("insert into Users (name, password) values ('max', '123')");
            statement.executeUpdate("insert into Users SET name = 'otherGuy', password = '321'");

            String userId = "1";
//            String userId = "1; delete from db ; ";
//            String userId = "1' or 1 = '1";
//            ResultSet resultSet = statement.executeQuery("select  * from Users where id = '" + userId + "'");
//
//            while (resultSet.next()) {
//                System.out.println("userName: " + resultSet.getString("name"));
//                System.out.println("userPassword: " + resultSet.getString("password"));
//            }

            //TODO: change prepare - No value specified for parameter 2
            PreparedStatement preparedStatement = conn.prepareStatement("select * from Users where id = ? and name = ?");
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, "userName");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("userName: " + resultSet.getString("name"));
                System.out.println("userPassword: " + resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
