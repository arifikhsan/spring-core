package com.example.springcore;

import com.example.springcore.model.Bar;
import com.example.springcore.model.Foo;
import com.example.springcore.model.FooBar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DependencyInjectionTest {
    private ApplicationContext context;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyConfigurationConfiguration.class);
    }

    @Test
    void testDI() {
        var foo = context.getBean("fooSecond", Foo.class);
        var bar = context.getBean(Bar.class);
        var fooBar = context.getBean(FooBar.class);

        assertSame(foo, fooBar.getFoo());
        assertSame(bar, fooBar.getBar());
    }

    @Test
    void testNoDI(){
        var foo = new Foo();
        var bar = new Bar();
        var fooBar = new FooBar(foo, bar);

        assertSame(foo, fooBar.getFoo());
        assertSame(bar, fooBar.getBar());
    }
}
