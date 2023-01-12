package com.example.demo.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.StudentEntity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<StudentEntity> studentList = new ArrayList<>();

    @Autowired
    private StudentRepository studentRepository;



}