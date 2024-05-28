package com.ahri.springbootlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ahri.springbootlearn.mapper"})
public class SpringBootLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);
    }
}
