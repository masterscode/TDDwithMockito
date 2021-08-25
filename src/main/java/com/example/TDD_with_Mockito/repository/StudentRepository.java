package com.example.TDD_with_Mockito.repository;

import com.example.TDD_with_Mockito.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    Boolean existsByEmail(String email);
}
