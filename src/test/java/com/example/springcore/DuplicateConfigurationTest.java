package com.example.springcore;

import com.example.springcore.model.Foo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateConfigurationTest {
    @Test
    void testDuplicateConfiguration() {
        var context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        assertThrows(NoUniqueBeanDefinitionException.class, () -> context.getBean(Foo.class));
    }

    @Test
    void getBean() {
        var context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        var foo1 = context.getBean("foo1", Foo.class);
        var foo2 = context.getBean("foo2", Foo.class);

        assertNotSame(foo1, foo2);
    }
}
