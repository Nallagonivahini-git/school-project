package com.acs.studentDetails.controller;

import com.acs.studentDetails.model.Student;
import com.acs.studentDetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService  studentService;

    @GetMapping("/test")
    public void display(){
        System.out.println("I am testing the app");

    }
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        System.out.println("Student is added ");
        studentService.save(student);
        return "student added";

    }

    @GetMapping("/get-allStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student){
        studentService.update(student);
        return "Student updated";

    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        studentService.deleteByid(id);
        return "student deleted";

    }

    @GetMapping("/getoneStudent/{id}")
    public Student getoneStudent(@PathVariable("id") int id){
       return studentService.getByid(id);

    }

    @GetMapping("/track")
    public Map<String, String> trackAllStudent(){
        return studentService.trackStudent();

    }
}
