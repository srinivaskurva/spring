package com.gradle.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan(basePackages = "com.gradle.test.controller")
public class SpringBootGradleTestApp extends SpringBootServletInitializer {

    public static void main(String[] arg) {
        SpringApplication.run(SpringBootGradleTestApp.class, arg);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootGradleTestApp.class);
    }

}
