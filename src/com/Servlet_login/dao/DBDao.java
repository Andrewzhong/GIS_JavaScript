package com.Servlet_login.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBDao {

    private static String DB_USER ="root";
    private static String DB_PASSWORD ="";
    private static String DB_URL = "jdbc:mysql://localhost:3306/Servlet_db";
    private static String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static Connection connection = null;

    //connection database;

    public static Connection getConnection(){
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

        }catch (Exception e){
            System.out.println("database connection failed,Please check para!!!");
            e.printStackTrace();
        }
        return connection;

    }

    public static void closeConnection(Connection connection){
        if (connection != null){
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

}
