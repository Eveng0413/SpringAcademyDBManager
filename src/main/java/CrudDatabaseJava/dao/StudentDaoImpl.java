package CrudDatabaseJava.dao;

import CrudDatabaseJava.Student;

public class StudentDaoImpl implements StudentDao{

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


}
