package com.example.springcore;

import com.example.springcore.model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimary() {
        var foo = context.getBean(Foo.class);
        var foo1 = context.getBean("foo1", Foo.class);
        var foo2 = context.getBean("foo2", Foo.class);

        assertSame(foo, foo1);
        assertNotSame(foo, foo2);
        assertNotSame(foo1, foo2);
    }
}