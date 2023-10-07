package org.example.emall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.example.emall.ware.dao")
@SpringBootApplication
public class EmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallWareApplication.class, args);
    }
}