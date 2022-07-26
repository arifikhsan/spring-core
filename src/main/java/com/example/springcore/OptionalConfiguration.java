package com.example.springcore;

import com.example.springcore.model.Bar;
import com.example.springcore.model.Foo;
import com.example.springcore.model.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
