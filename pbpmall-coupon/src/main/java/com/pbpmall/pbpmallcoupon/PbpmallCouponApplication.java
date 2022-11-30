package com.pbpmall.pbpmallcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PbpmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbpmallCouponApplication.class, args);
    }

}
