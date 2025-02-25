package com.example.springDatabase.Controller;

import com.example.springDatabase.model.Student;
import com.example.springDatabase.service.StudentService;
import com.example.springDatabase.service.StudentServiceImpl;
import com.example.springDatabase.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class studentController {

    @Autowired
    StudentService studentService ;
    TeacherService teacherService;

    //bean testing
    @Autowired
    private Student student1;

    //CRUD

    @PostMapping("/add/{name}")
    //Create -Post
    public String addStudent(@PathVariable String name, String email, String location){
        studentService.addStudent(name, email,  location);
        return "Success";
    }

    //Read: read all -Get
    @GetMapping("/all")
    public Collection<Student> getAllStudent(){
        return teacherService.getAllStudents();

    }

    //Read: readbyname -Get
    @GetMapping("/{name}")
    public String getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name).toString();

    }

    //Update: updateLocation -Put
    @PutMapping
    public void updateStudent(String name,String location){
        studentService.updateStudent(name, location);

    }

    //Delete: deleteByName -DELETE
    @DeleteMapping("/{name}")
    public void deleteStudent(@PathVariable String name){
        studentService.deleteStudent(name);
    }

    //Bean Testing
    @GetMapping
    public String getNewStudent(){
        return student1.toString();

    }
}
