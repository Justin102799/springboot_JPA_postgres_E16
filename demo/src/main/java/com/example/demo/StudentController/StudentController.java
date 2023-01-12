package com.example.demo.StudentController;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.StudentEntity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public @ResponseBody String addStudents (@RequestParam String studentFname,
                                             @RequestParam String studentLname,
                                             @RequestParam String studentEmail,
                                             @RequestParam String studentCourse){
        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setStudentFname(studentFname);
        studentEntity.setStudentLname(studentLname);
        studentEntity.setStudentEmail(studentEmail);
        studentEntity.setStudentCourse(studentCourse);
        studentRepository.save(studentEntity);
        return "Details got saved!";
    }

    @GetMapping("/students")
    public @ResponseBody Iterable<StudentEntity> getAllStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/studentid")
    public ResponseEntity<List<StudentEntity>> getById (@RequestParam int id){
        return new ResponseEntity<>(studentRepository.findByid(id), HttpStatus.OK);
    }



}

