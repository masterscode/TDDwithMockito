package com.example.TDD_with_Mockito.services;

import com.example.TDD_with_Mockito.models.Student;
import com.example.TDD_with_Mockito.repository.StudentRepository;
import com.example.TDD_with_Mockito.test_resources.StudentTestResources;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest extends StudentTestResources {
    @Autowired
    private @Mock StudentRepository studentRepository;

    @Autowired
    private StudentServiceImpl underTest;


    @BeforeEach
    void setUp(){
        underTest = new StudentServiceImpl(studentRepository);
    }

    @Test
    void getAllStudent() {
        //when
        underTest.getAllStudent();

        verify(studentRepository).findAll();
    }

    @Test
    @Disabled
    void addStudent() {
        Student studentToSave = this.students.get(1);
        underTest.addStudent(studentToSave);

        ArgumentCaptor<Student> studentArgumentCaptor = ArgumentCaptor.forClass(Student.class);

        verify(studentRepository).save(studentArgumentCaptor.capture());

        Student capturedStudent = studentArgumentCaptor.getValue();

        assertThat(capturedStudent).isEqualTo(studentToSave);
    }

    @Test
    @Disabled
    void deleteStudent() {
    }
}