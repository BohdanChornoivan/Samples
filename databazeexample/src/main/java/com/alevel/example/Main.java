package com.alevel.example;

import com.alevel.example.sql.CreateTable;
import com.alevel.example.sql.InsertData;
import com.alevel.example.sql.SelectData;
import com.alevel.example.sql.UpdateData;
import org.h2.Driver;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


        public static String url = "jdbc:h2:~/test";
        public static String user = "scoliztur";
        public static String password = "lehljv97";


    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("org.h2.Driver");
        Driver driver = org.h2.Driver.load();

        try(Connection connection = DriverManager.getConnection(url, user, password)) {

            new CreateTable().create(connection);

            new InsertData().insert(connection);

            new SelectData().select(connection);

            new UpdateData().update(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("The end");
    }

}
