package com.acs.studentDetails.service;

import com.acs.studentDetails.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    void save(Student student);

    List<Student> getAllStudent();

    void  update(Student student);
    void deleteByid(int id);

    Student getByid(int id);

    Map<String, String> trackStudent();
}
