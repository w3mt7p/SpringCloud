package com.pbpmall.pbpmallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.pbpmall.pbpmallmember.feign")
public class PbpmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbpmallMemberApplication.class, args);
    }

}
