package com.pbpmall.pbpmallware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PbpmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbpmallWareApplication.class, args);
    }

}
