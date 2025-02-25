package CrudDatabaseJava.service;

import CrudDatabaseJava.Student;
import CrudDatabaseJava.dao.StudentDao;
import CrudDatabaseJava.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

    //面向接口开发，不用实例化都可以先开发
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void addStudent(String input) {
        String[] split = input.split(",");
        Student student = new Student();
        student.setName(split[1]);
        student.setEmail(split[2]);
        student.setLocation(split[3]);

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
    public void updateStudent(String input) {

        String[] split = input.split(",");
        Student student = studentDao.getStudentbyName(split[1]);
        if(student!=null){
            student.setLocation(split[2]);
        }else throw new RuntimeException("Student not existed");


    }

    @Override
    public void deleteStudent(String name) {
        studentDao.deleteStudent(name);

    }
}
