package com.example.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.example.springcore.configuration")
public class ScanConfiguration {
}
