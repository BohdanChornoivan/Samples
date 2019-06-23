package com.alevel.example.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    public static  final String insertPiter = "INSERT INTO TEST VALUES(1, 'Peter');";

    public static  final String insertMary = "INSERT INTO TEST VALUES(2, 'Mary');";

    public static final String insertSomeOne = "INSERT INTO TEST VALUES(?, ?);";

    public void insert(Connection connection) throws SQLException {

        Statement statement = connection.createStatement();
        statement.execute(insertMary);
        statement.execute(insertPiter);

        PreparedStatement preparedStatement = connection.prepareStatement(insertSomeOne);

        for (int i = 3; i < 500; i++) {
            preparedStatement.setInt(1,i);
            preparedStatement.setString(2,"SomeOne-" + i);

            preparedStatement.execute();
        }

    }
}
