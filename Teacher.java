package com.acs.studentDetails.model;

import javax.persistence.*;

@Entity
@Table(name="teacher_table")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TeacherId")
    private int teacherId;
    @Column(name = "TeacherName")
    String teacherName;
    @Column(name = "Salary")
    double salary;

    @Column(name = "SalaryStatus")
    String status;

    public Teacher(int teacherId, String teacherName, double salary, String status) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.salary = salary;
        this.status = status;
    }

    public Teacher(){
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                '}';
    }
}


