package com.example.springcore;

import com.example.springcore.model.Foo;
import com.example.springcore.model.FooBar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OptionalConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testOptional() {
        var foo = context.getBean(Foo.class);
        var fooBar = context.getBean(FooBar.class);

        assertNull(fooBar.getBar());
        assertSame(foo, fooBar.getFoo());
    }
}