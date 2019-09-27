package com.cgq.test.springbootmybatis.repository;

import com.cgq.test.springbootmybatis.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(Integer id);
    public int save(Student student);
    public int update(Student student);
    public int deleteById(Integer id);
}
