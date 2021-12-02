package com.web.blogproject;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

@Slf4j
@SpringBootTest
public class DataSourceTests {

    @Autowired
    private DataSource dataSource;
    /*
    private static final String driver = "org.mariadb.jdbc.Driver";
    private static final String url = "jdbc:mariadb://localhost:3308/blog?serverTimezone=Asia/Seoul";
    private static final String user = "root";
    private static final String password = "Abcd123@";
    */

    @Test
    public void testConnection() throws Exception{
       // Class.forName(driver);
        try {
            //Connection con = DriverManager.getConnection(url, user, password);
            //log.info("connection : " + con);
            Connection con = dataSource.getConnection();
            log.info("Meta Data : " + con.getMetaData());
            log.info("Drive Name : " + con.getMetaData().getDriverName());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
