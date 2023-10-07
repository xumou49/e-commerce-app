package org.example.emall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.example.emall.product.dao")
@SpringBootApplication
public class EmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallProductApplication.class, args);
    }
}