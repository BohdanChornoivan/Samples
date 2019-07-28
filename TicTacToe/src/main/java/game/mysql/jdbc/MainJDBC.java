package game.mysql.jdbc;

import game.gamer.Player;
import game.mysql.jdbc.entity.CreateTable;
import game.mysql.jdbc.entity.InsertData;
import game.realization.MarksForBoard;
import game.realization.RealizationGame;

import java.sql.*;

public class MainJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/tictactoe?serverTimezone=UTC&autoReconnect=true&useSSL=false";
    private static final String name = "root";
    private static final String password = "Boser11Boh.";

    public static void main(String[] args) {


        Player playerB1 = new Player("B1-X", MarksForBoard.MARK_X.getMark());

        Player playerB2 = new Player("B2-0", MarksForBoard.MARK_0.getMark());

        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, name, password)) {

                Statement statement = connection.createStatement();

                new CreateTable().create(statement);

                new InsertData(playerB1).insert(statement);

                new InsertData(playerB2).insert(statement);

                ResultSet resultSet = statement.executeQuery("select * from game_match;");

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
