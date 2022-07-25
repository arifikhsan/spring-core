package com.example.springcore;

import com.example.springcore.model.Bar;
import com.example.springcore.model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ScanConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    }

    @Test
    void testScan() {
        assertNotNull(context.getBean(Bar.class));
        assertNotNull(context.getBean(Foo.class));
    }
}
