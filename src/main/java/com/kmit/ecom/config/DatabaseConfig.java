package com.kmit.ecom.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {


    @Bean
    @ConfigurationProperties(prefix = "app.datasource")
    public com.zaxxer.hikari.HikariDataSource dataSource() {
        return new com.zaxxer.hikari.HikariDataSource();
    }
}
