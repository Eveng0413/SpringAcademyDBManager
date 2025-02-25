package com.example.springDatabase.dao;


import com.example.springDatabase.model.Student;

import java.util.HashMap;

public class Database {
    public static HashMap<String, Student> data = new HashMap<>();
    static{
        data.put("John", new Student("John","123","la"));
        data.put("Alice", new Student("Alice","1234","la"));
    }
}
