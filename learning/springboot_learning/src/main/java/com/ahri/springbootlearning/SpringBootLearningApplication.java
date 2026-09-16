package com.ahri.springbootlearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ahri.springbootlearning.mapper"})
public class SpringBootLearningApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningApplication.class, args);
    }
}
