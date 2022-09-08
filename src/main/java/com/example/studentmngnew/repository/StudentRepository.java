package com.example.studentmngnew.repository;

import com.example.studentmngnew.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

