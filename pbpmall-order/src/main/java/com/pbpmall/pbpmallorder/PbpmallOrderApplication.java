package com.pbpmall.pbpmallorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PbpmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbpmallOrderApplication.class, args);
    }

}
