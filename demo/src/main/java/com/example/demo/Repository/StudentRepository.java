package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.StudentEntity.StudentEntity;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    List<StudentEntity>findByid(int id);

}
