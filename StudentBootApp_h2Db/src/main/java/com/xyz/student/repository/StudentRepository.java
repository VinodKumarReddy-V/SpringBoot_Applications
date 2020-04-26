package com.xyz.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
