package com.cpw.sqlview.sqlview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cpw.sqlview.sqlview.Mappers")
@SpringBootApplication
public class SqlviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlviewApplication.class, args);
    }

}
