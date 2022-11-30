package com.pbpmall.pbpmallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.pbpmall.pbpmallproduct.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class PbpmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbpmallProductApplication.class, args);
    }

}
