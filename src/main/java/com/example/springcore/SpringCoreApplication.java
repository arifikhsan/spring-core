package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        System.out.println("=run spring=");
        SpringApplication.run(SpringCoreApplication.class, args);
    }

}
