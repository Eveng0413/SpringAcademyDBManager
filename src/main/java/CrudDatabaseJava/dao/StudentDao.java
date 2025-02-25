package CrudDatabaseJava.dao;

import CrudDatabaseJava.Student;

public interface StudentDao {
    void addStudent(Student student);
    Student getStudentbyName(String student);
    void updateStudent(Student student);
    void deleteStudent(String student);

}
