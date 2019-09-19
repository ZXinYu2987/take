package com.mr.take_consummer_merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TakeConsummerMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeConsummerMerchantApplication.class, args);
    }

}
