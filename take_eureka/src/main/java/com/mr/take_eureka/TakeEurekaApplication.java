package com.mr.take_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TakeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeEurekaApplication.class, args);
    }

}
