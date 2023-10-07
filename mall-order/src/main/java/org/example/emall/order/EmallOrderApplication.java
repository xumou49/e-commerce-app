package org.example.emall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.example.emall.order.dao")
@SpringBootApplication
public class EmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallOrderApplication.class, args);
    }
}