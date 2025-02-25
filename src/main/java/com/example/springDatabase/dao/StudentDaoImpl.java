package com.example.springDatabase.dao;

import com.example.springDatabase.model.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Override
    public void addStudent(Student student) {
        Database.data.put(student.getName(),student);
    }

    @Override
    public Student getStudentbyName(String student) {
        return Database.data.get(student);

    }

    @Override
    public void updateStudent(Student student) {
        Database.data.put(student.getName(), student);
    }

    @Override
    public void deleteStudent(String student) {
        Database.data.remove(student);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return Database.data.values();
    }


}
