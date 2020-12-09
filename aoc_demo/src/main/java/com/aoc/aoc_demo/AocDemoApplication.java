package com.aoc.aoc_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AocDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AocDemoApplication.class, args);
    }

}
