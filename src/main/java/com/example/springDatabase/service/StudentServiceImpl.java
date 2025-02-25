package com.example.springDatabase.service;


import com.example.springDatabase.dao.Database;
import com.example.springDatabase.dao.StudentDao;
import com.example.springDatabase.dao.StudentDaoImpl;
import com.example.springDatabase.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //面向接口开发，不用实例化都可以先开发
    @Autowired
    StudentDao studentDao ;

    @Override
    public void addStudent(String name, String email, String location) {
        Student student = new Student(name,email,location);

        studentDao.addStudent(student);

    }

    @Override
    public Student getStudentByName(String name) {
        Student student = studentDao.getStudentbyName(name);
        if(student!=null){
            return student;
        }else throw new RuntimeException("Student not existed");

    }

    @Override
    public void updateStudent(String name,String location) {

        Student student = studentDao.getStudentbyName(name);
        if(student!=null){
            student.setLocation(location);
        }else throw new RuntimeException("Student not existed");


    }

    @Override
    public void deleteStudent(String name) {
        studentDao.deleteStudent(name);

    }

}
