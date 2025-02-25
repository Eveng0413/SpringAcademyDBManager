package com.example.springDatabase.config;

import com.example.springDatabase.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeans {

    @Bean
    public Student student1(){
        Student student = new Student("Jack","1234","oh");
        return student;
    }
}
