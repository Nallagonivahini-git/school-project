package com.acs.studentDetails.serviceImpl;

import com.acs.studentDetails.dao.TeacherRepository;
import com.acs.studentDetails.model.Student;
import com.acs.studentDetails.model.Teacher;
import com.acs.studentDetails.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {

@Autowired
    TeacherRepository teacherRepository;
@Override
    public void save(Teacher teacher) {
    String status ="NOT_CREDITED";
    if(teacher.getSalary()!=0){
        status="CREDITED";
    }
    teacher.setStatus(status);
    teacherRepository.save(teacher);
}

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public void update(Teacher teacher) {
    teacherRepository.save(teacher);

    }

    @Override
    public void deleteByid(int teacherId) {
    teacherRepository.deleteById(teacherId);

    }

    @Override
    public Map<String, String> trackTeacher() {
        List<Teacher> teacherList=getAllTeacher();
        List<Teacher> tsList=new ArrayList<>();
        Map<String,String> salaryStatus=new HashMap<>();
        for (Teacher teacher: teacherList){
            if(teacher.getStatus().equals("CREDIT")){
                salaryStatus.put(teacher.getTeacherName(),teacher.getStatus());
                tsList.add(teacher);
            }
        }
        return salaryStatus;
    }
    }




