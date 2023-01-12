package com.example.demo.Service;

import com.example.demo.Repository.StudentRepository;

import com.example.demo.StudentEntity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String createStudent(String fname, String lname, String email, String course){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentFname(fname);
        studentEntity.setStudentLname(lname);
        studentEntity.setStudentEmail(email);
        studentEntity.setStudentCourse(course);
        studentRepository.save(studentEntity);

        return "Details Saved!";
    }

    public Iterable<StudentEntity> getAllStudent(){
        return studentRepository.findAll();
    }

    public ResponseEntity<List<StudentEntity>> getById (@RequestParam int id){
        return new ResponseEntity<>(studentRepository.findByid(id), HttpStatus.OK);
    }



}