package com.example.demo;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class DatabaseInitializer {
    public DatabaseInitializer() throws Exception {
        String url = "jdbc:mysql://localhost:3306/bean_db";
        String user = "root";
        String password = "Password1";
        String baseUrl = "/Users/harukisugiyama/Documents/WorkUp/WorkUpServer/src/main/resources/";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            ScriptRunner runner = new ScriptRunner(conn);
            //TODO: 環境変数にする
            runner.runScript(new FileReader(baseUrl + "case-schema.sql"));
            runner.runScript(new FileReader(baseUrl + "case-data.sql"));
        }
    }

}
