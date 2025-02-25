package com.example.springDatabase.service;

import com.example.springDatabase.dao.StudentDao;
import com.example.springDatabase.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    StudentDao studentDao;

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();

    }
}
