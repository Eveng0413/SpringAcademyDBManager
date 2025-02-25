package com.example.springDatabase.dao;

import com.example.springDatabase.model.Student;

import java.util.Collection;

public interface StudentDao {
    void addStudent(Student student);
    Student getStudentbyName(String student);
    void updateStudent(Student student);
    void deleteStudent(String student);
    Collection<Student> getAllStudents();

}
