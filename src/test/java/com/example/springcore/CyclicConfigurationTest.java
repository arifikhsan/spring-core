package com.example.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CyclicConfigurationTest {
    @Test
    void testCyclic() {
        assertThrows(Throwable.class, () -> new AnnotationConfigApplicationContext(CyclicConfiguration.class));
    }
}
