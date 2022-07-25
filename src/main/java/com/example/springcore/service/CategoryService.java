package com.example.springcore.service;

import com.example.springcore.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
@Component
public class CategoryService {
    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
