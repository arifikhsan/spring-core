package com.example.springcore;

import com.example.springcore.model.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BeanTest {
    @Test
    void testCreateBean() {
        var context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        assertNotNull(context);
    }

    @Test
    void testGetBean() {
        var context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        var foo1 = context.getBean(Foo.class);
        var foo2 = context.getBean(Foo.class);

        assertSame(foo1, foo2);
    }
}
