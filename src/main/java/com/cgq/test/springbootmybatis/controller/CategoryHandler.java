package com.cgq.test.springbootmybatis.controller;

import com.cgq.test.springbootmybatis.entity.Category;
import com.cgq.test.springbootmybatis.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryHandler {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/findAllCategory")
    public List<Category> findAll(){
        return categoryRepository.findAllCategory();
    }
}
