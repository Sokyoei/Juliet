package com.ahri.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// @SpringBootApplication
public class SpringBootLearnWebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(SpringBootLearnWebApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnWebApplication.class, args);
    }
}
