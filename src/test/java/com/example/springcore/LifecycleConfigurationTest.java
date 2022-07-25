package com.example.springcore;

import com.example.springcore.model.Connection;
import com.example.springcore.model.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LifecycleConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
        context.registerShutdownHook(); // pakai ini tidak perlu pakai context.close()
    }

    @AfterEach
    void tearDown() {
        // context.close();
    }

    @Test
    void testConnection() {
        var connection = context.getBean(Connection.class);
        assertNotNull(connection);
    }

    @Test
    void testServer() {
        var server = context.getBean(Server.class);
        assertNotNull(server);
    }
}
