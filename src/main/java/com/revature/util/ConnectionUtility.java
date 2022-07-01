package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
    private final String URL = "jdbc:postgresql://127.0.0.1:5432/postgres";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "postgres";

    private Connection connection;

    private ConnectionUtility(){}

    public Connection getConnection() throws SQLException {
        if(connection.isClosed() || connection == null){
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }

        return connection;
    }
}
