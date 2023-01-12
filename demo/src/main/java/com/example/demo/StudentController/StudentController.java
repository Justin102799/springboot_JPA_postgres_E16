package com.example.demo.StudentController;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
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
    private StudentService studentService;

    @PostMapping("/student")
    public @ResponseBody String addStudents (@RequestParam String studentFname,
                                             @RequestParam String studentLname,
                                             @RequestParam String studentEmail,
                                             @RequestParam String studentCourse){

        return studentService.createStudent(studentFname, studentLname, studentEmail, studentCourse);
    }

    @GetMapping("/students")
    public @ResponseBody Iterable<StudentEntity> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/studentid")
    public ResponseEntity<List<StudentEntity>> getById (@RequestParam int id){
        return studentService.getById(id);
    }



}

