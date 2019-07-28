package game.mysql.jdbc.entity;

import game.gamer.Player;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    private Player player;

    public InsertData(Player player) {
        this.player = player;
    }

    public void insert(Statement statement) throws SQLException {

        statement.executeUpdate("insert into  game_match (Name, Victory, Loss, Draw) values ('" + player.getName() + "', " + player.getWin() +  ", " + player.getLoss() + ", " + player.getDraw() + ");");

    }
}
