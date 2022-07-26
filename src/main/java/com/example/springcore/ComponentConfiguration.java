package com.example.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.example.springcore.service",
        "com.example.springcore.repository",
        "com.example.springcore.configuration"
})
public class ComponentConfiguration {
}
