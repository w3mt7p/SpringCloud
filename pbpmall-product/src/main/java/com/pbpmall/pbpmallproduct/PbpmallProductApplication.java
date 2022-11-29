package com.pbpmall.pbpmallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pbpmall.pbpmallproduct.dao")
@SpringBootApplication
public class PbpmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbpmallProductApplication.class, args);
    }

}
