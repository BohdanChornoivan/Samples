package game.mysql.jdbc.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    private String name;

    public InsertData(String name) {
        this.name = name;
    }

    public final String insertPlayer = "insert into  match1 (Name, Victory, Loss, Draw) values ('" + name + "', 1, 2, 3);";

    public void insert(Connection connection) throws SQLException {

        Statement statement = connection.createStatement();
        statement.execute(insertPlayer);


    }
}
