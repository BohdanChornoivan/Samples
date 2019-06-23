package com.alevel.example.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

    private final static String UPDATE = "UPDATE TEST SET name = 'PETER-2222' WHERE id = 1;";

    public void update(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        statement.execute(UPDATE);
    }


    public boolean en(String key, String...arg) {
        return true;
    }
}
