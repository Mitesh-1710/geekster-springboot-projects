package com.geekster.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.mapping.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
