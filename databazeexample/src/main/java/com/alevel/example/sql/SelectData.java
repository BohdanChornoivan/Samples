package com.alevel.example.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

    private final static String SELECT = "SELECT * FROM TEST;";

    public void select(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        statement.execute(SELECT);

        ResultSet set = statement.getResultSet();

        while (set.next()) {
            System.out.println(
                    "Result:" + set.getString(1) +
                            " " + set.getString(2));
        }
    }

}
