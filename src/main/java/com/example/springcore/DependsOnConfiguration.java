package com.example.springcore;

import com.example.springcore.model.Bar;
import com.example.springcore.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Bean
    @Lazy
    @DependsOn("bar")
    public Foo foo() {
        log.info("Creating foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Creating bar");
        return new Bar();
    }
}
