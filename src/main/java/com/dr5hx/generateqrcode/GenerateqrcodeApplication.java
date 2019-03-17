package com.dr5hx.generateqrcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@EnableAutoConfiguration
@ComponentScan("com.dr5hx.generateqrcode")
@EnableJpaRepositories("com.dr5hx.generateqrcode.dao")
@EntityScan("com.dr5hx.generateqrcode.model")
public class GenerateqrcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenerateqrcodeApplication.class, args);

    }

}
