package com.acs.studentDetails.controller;

import com.acs.studentDetails.model.Student;
import com.acs.studentDetails.model.Teacher;
import com.acs.studentDetails.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/addTeacher")
    public String addTeacher(@RequestBody Teacher teacher) {
        System.out.println("Teacher Added");
        teacherService.save(teacher);
        return "Teacher added";

    }

    @GetMapping("/get-allTeacher")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @PutMapping("/updateTeacher")
    public String updateStudent(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
        return "Teacher updated";
    }

    @DeleteMapping("/deleteTeacher/{teacherId}")
    public String deleteTeacher(@PathVariable("teacherId") int teacherId) {
        teacherService.deleteByid(teacherId);
        return "Teacher deleted";
    }

    @GetMapping("/tracksalary")
    public Map<String, String> trackAllStudent()
    {
        return teacherService.trackTeacher();

    }
}


