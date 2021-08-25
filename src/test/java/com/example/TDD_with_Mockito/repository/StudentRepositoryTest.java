package com.example.TDD_with_Mockito.repository;

import com.example.TDD_with_Mockito.models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository underTest;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByEmail() {
    }

    @Test
    @DisplayName("it should test if student exists by email")
    void existsByEmail() {
        final String email = "micheal@email.com";
        //given
        Student student = new Student();
        student.setEmail(email);
        student.setName("Micheal Opera");
        student.setGender("male");

        underTest.save(student);

        //when

        boolean isExist = underTest.existsByEmail(email);

        //then

        assertThat(isExist).isTrue();
    }
}