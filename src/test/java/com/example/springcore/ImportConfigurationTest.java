package com.example.springcore;

import com.example.springcore.model.Bar;
import com.example.springcore.model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ImportConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testImport(){
        var foo = context.getBean(Foo.class);
        var bar = context.getBean(Bar.class);

        assertNotNull(foo);
        assertNotNull(bar);
    }
}
