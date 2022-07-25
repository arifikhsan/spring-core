package com.example.springcore;

import com.example.springcore.configuration.BarConfiguration;
import com.example.springcore.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { FooConfiguration.class, BarConfiguration.class })
public class ImportConfiguration {
}
