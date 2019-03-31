package com.dr5hx.generateqrcode;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(@MapperScan(basePackages = "com.dr5hx.generateqrcode.repository"))
public class GenerateqrcodeApplication {

    public static void main(String[] args) {

        SpringApplication.run(GenerateqrcodeApplication.class, args);

    }

}
