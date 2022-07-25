package com.example.springcore;

import com.example.springcore.model.Connection;
import com.example.springcore.model.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean // karena telah menggunakan @PostConstruct dan @PreDestroy
    public Server server() {
        return new Server();
    }
}
