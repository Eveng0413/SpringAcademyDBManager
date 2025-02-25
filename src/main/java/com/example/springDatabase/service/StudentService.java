package com.example.springDatabase.service;


import com.example.springDatabase.model.Student;

import java.util.Collection;

public interface StudentService {
    void addStudent(String name, String email, String location);
    Student getStudentByName(String name);
    void updateStudent(String name,String location);
    void deleteStudent(String name);


}
