package com.example.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationContextTest {
    @Test
    void testApplicationContext() {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        assertNotNull(context);
    }
}
