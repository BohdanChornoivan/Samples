

import entity.CreateTable;
import entity.InsertData;
import entity.SelectData;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/slt?serverTimezone=UTC&autoReconnect=true&useSSL=false";
        String name = "root";
        String password = "Boser11Boh.";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, name, password)) {

//                new CreateTable().create(connection);
//
//                new InsertData().insert(connection);
//
//                new SelectData().select(connection);


                Statement statement = connection.createStatement();

                statement.executeUpdate("DROP TABLE IF EXISTS Books;");

                statement.executeUpdate("CREATE TABLE Books(id MEDIUMINT not null AUTO_INCREMENT, name VARCHAR(30) not null, PRIMARY KEY (id));");

                statement.executeUpdate("insert  into  Books (name) values ('Inferno');");
                statement.executeUpdate("insert  into  Books (name) values ('Solomon key');");

                ResultSet resultSet = statement.executeQuery("select * from Books;");

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2) + "\n");
                }

                ResultSet resultSet1 = statement.executeQuery("select name from Books;");

                while (resultSet1.next()) {
                    System.out.println(resultSet1.getString(1));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}