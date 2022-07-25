package com.example.springcore;

import com.example.springcore.model.Foo;
import com.example.springcore.repository.CategoryRepository;
import com.example.springcore.repository.CustomerRepository;
import com.example.springcore.repository.ProductRepository;
import com.example.springcore.service.CategoryService;
import com.example.springcore.service.CustomerService;
import com.example.springcore.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComponentConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testComponent() {
        var productService1 = context.getBean(ProductService.class);
        var productService2 = context.getBean("productService", ProductService.class);

        assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection() {
        var service = context.getBean(ProductService.class);
        var repository = context.getBean(ProductRepository.class);

        assertSame(repository, service.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection() {
        var service = context.getBean(CategoryService.class);
        var repository = context.getBean(CategoryRepository.class);

        assertSame(repository, service.getCategoryRepository());
    }

    @Test
    void testFieldDependencyInjection() {
        var service = context.getBean(CustomerService.class);
        var repository = context.getBean(CustomerRepository.class);

        assertSame(repository, service.getCustomerRepository());
    }
}
