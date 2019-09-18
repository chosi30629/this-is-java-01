package _14_collection_framework.map_example;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = "src/main/java/_14_collection_framework/map_example/database.properties";
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

}

/*
    결과
        driver: oracle.jdbc.OracleDriver
        url: jdbc:oracle.thin:@localhost:1521:orcl
        username: scott
        password: tiger
 */
