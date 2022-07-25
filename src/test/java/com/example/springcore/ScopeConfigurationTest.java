package com.example.springcore;

import com.example.springcore.model.Bar;
import com.example.springcore.model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ScopeConfigurationTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testPrototypeScope() {
        var foo1 = context.getBean(Foo.class);
        var foo2 = context.getBean(Foo.class);
        var foo3 = context.getBean(Foo.class);

        assertNotEquals(foo1, foo2);
        assertNotEquals(foo1, foo3);
        assertNotEquals(foo2, foo3);
    }

    @Test
    void testDoubletonScope() {
        var bar1 = context.getBean(Bar.class);
        var bar2 = context.getBean(Bar.class);
        var bar3 = context.getBean(Bar.class);
        var bar4 = context.getBean(Bar.class);

        assertSame(bar1, bar3);
        assertSame(bar2, bar4);

        assertNotSame(bar1, bar2);
        assertNotSame(bar3, bar4);
    }
}