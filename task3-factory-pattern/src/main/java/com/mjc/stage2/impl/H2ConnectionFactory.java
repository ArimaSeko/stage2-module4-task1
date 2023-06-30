package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory  implements ConnectionFactory {
    @Override
    public Connection createConnection() {
        Connection connection =null;
        try{
            Properties properties = new Properties();
            properties.load(H2ConnectionFactory.class.getClassLoader().getResourceAsStream("h2database.properties"));
            String url = properties.getProperty("db_url");
            String name=properties.getProperty("user");
            String password=properties.getProperty("password");
            connection = DriverManager.getConnection(url,name,password);
        } catch (IOException e) {
            throw new RuntimeException("IOE");
        } catch (SQLException e) {
            throw new RuntimeException("SQL E");
        }
        return connection;
    }
    // Write your code here!
}

