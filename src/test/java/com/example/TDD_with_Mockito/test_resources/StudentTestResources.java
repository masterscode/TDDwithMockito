package com.example.TDD_with_Mockito.test_resources;

import com.example.TDD_with_Mockito.models.Student;

import java.util.Arrays;
import java.util.List;

public class StudentTestResources {
    protected List<Student> students = Arrays.asList(
            new Student(1L, "emmanuel","email@email.com", "male"),
            new Student(2L, "ochuko","student@email.com", "male"),
            new Student(3L, "kome","email22@email.com", "male"),
            new Student(4L, "patience","email2@email.com", "male")
            );
}
