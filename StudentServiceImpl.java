package com.acs.studentDetails.serviceImpl;

import com.acs.studentDetails.dao.StudentRepository;
import com.acs.studentDetails.model.Student;
import com.acs.studentDetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  StudentRepository studentRepository;

    @Override
    public void save(Student student) {
      String status ="NOT_PAID";
      if(student.getPaidFee()!=0){
        status="PAID";
      }
      student.setStatus(status);
        studentRepository.save(student);
    }

  @Override
  public List<Student> getAllStudent() {
    return studentRepository.findAll();
  }

  @Override
  public void update(Student student) {
    studentRepository.save(student);

  }

  @Override
  public void deleteByid(int id) {
    studentRepository.deleteById(id);
  }

  @Override
  public Student getByid(int id) {
   return studentRepository.findById(id).get();
  }

  @Override
  public Map<String, String> trackStudent() {
     List<Student> studentList=getAllStudent();
    List<Student> psList=new ArrayList<>();
     Map<String,String> paidStudent=new HashMap<>();
    for (Student student: studentList){
      if(student.getStatus().equals("PAID")){
       paidStudent.put(student.getName(),student.getStatus());
       psList.add(student);
      }
    }
    return paidStudent;
  }

}
