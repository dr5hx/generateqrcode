package com.dr5hx.generateqrcode;

import com.dr5hx.generateqrcode.util.NullCheckTools;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
@MapperScans(@MapperScan(basePackages = "com.dr5hx.generateqrcode.repository"))
public class GenerateqrcodeApplication {

    public static void main(String[] args) {

        SpringApplication.run(GenerateqrcodeApplication.class, args);

    }

}
