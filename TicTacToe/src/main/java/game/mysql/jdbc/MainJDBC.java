package game.mysql.jdbc;

import game.gamer.Player;
import game.mysql.jdbc.entity.CreateTable;
import game.realization.MarksForBoard;
import game.realization.RealizationGame;

import java.sql.*;

public class MainJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tictactoe?serverTimezone=UTC&autoReconnect=true&useSSL=false";
        String name = "root";
        String password = "Boser11Boh.";

        RealizationGame realizationGame = new RealizationGame();

        Player playerB1 = new Player("B1-X", MarksForBoard.MARK_X.getMark());

        Player playerB2 = new Player("B2-0", MarksForBoard.MARK_0.getMark());

        realizationGame.play(playerB1, playerB2);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, name, password)) {

                new CreateTable().create(connection);

                Statement statement = connection.createStatement();

                statement.executeUpdate("DROP TABLE IF EXISTS match1;");


                statement.executeUpdate("CREATE TABLE match1 (Name VARCHAR(50), Victory INT(11) NOT NULL, Loss INT(11) NOT NULL, Draw INT(11) NOT NULL);");


                statement.executeUpdate("insert into  match1 (Name, Victory, Loss, Draw) values ('" + playerB1.getName() + "', 1, 2, 3);");
                statement.executeUpdate("insert into  match1 (Name, Victory, Loss, Draw) values ('" + playerB2.getName() + "', 2, 1, 3);");

                ResultSet resultSet = statement.executeQuery("select * from match1;");

                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }

                statement.close();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
