package com.cgq.test.springbootmybatis.repository;

import com.cgq.test.springbootmybatis.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryRepository {

    @Select("select * from category_")
    List<Category> findAllCategory();
}
