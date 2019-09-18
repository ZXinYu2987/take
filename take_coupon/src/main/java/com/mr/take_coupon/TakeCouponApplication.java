package com.mr.take_coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TakeCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeCouponApplication.class, args);
    }

}
