package com.springboot.cruddemo.DAO;

import com.springboot.cruddemo.Entity.student;

import java.util.List;

public interface StudentDAO
{

    void save(student thestudent);
    student findbyid(Integer id);
    List<student> findAll();
    List<student> findbylastname(String thelastname);


    List<student> findAll(String thelastname);
    void update(student thestudent);
    void delete(Integer id);
    int deltetAll();
}
