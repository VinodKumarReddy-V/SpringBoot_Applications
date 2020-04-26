package com.abc.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
