package org.example.emall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.example.emall.coupon.dao")
@SpringBootApplication
public class EmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmallCouponApplication.class, args);
    }
}