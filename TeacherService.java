package com.acs.studentDetails.service;

import com.acs.studentDetails.model.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    
    

    void save(Teacher teacher);

    List<Teacher> getAllTeacher();

    void update(Teacher teacher);

    void deleteByid(int teacherId);

    Map<String, String> trackTeacher();
}
