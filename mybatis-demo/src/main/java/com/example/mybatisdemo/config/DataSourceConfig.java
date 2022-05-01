package com.example.mybatisdemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class DataSourceConfig {

//    private String username;
//
//    private String password;
//
//    private String url;
//
//    private String drivername;

    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create()
                .username("root")
                .password("rootroot")
                .url("jdbc:mysql://127.0.0.1:3306/test")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }
}
