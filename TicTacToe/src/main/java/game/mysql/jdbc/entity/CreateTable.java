package game.mysql.jdbc.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    private final String DROP_TABLE = "DROP TABLE IF EXISTS game_match;";

    private final String CREATE_TABLE = "CREATE TABLE game_match (Name VARCHAR(50), Victory INT(11) NOT NULL, Loss INT(11) NOT NULL, Draw INT(11) NOT NULL);";

    public void create(Connection connection) throws SQLException {

        Statement create = connection.createStatement();

        if(create.execute(DROP_TABLE)) {
            System.out.println("past table destroyed");
        }

        create.execute(CREATE_TABLE);
    }
}
