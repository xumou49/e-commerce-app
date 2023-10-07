package org.example.emall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.example.emall.member.dao")
@SpringBootApplication
public class EmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallMemberApplication.class, args);
    }
}