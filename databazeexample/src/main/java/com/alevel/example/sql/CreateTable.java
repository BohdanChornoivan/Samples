package com.alevel.example.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    private final String DROP_TABLE = "DROP TABLE IF EXISTS TEST;";
    private final String CREATE_TABLE = "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));";


    public void create(Connection connection) throws SQLException {

        Statement create = connection.createStatement();

        if(create.execute(DROP_TABLE)) {
            System.out.println("s");
        }

        create.execute(CREATE_TABLE);
    }

}
