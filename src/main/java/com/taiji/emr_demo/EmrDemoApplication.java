package com.taiji.emr_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.taiji.emr_demo.gen.mapper")
public class EmrDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmrDemoApplication.class, args);
    }

}
