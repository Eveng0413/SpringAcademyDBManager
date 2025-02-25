package CrudDatabaseJava.service;

import CrudDatabaseJava.Student;

public interface StudentService {
    void addStudent(String input);
    Student getStudentByName(String name);
    void updateStudent(String input);
    void deleteStudent(String name);

}
