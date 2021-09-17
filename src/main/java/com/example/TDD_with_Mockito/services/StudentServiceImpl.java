package com.example.TDD_with_Mockito.services;


import com.example.TDD_with_Mockito.models.Student;
import com.example.TDD_with_Mockito.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        if (Boolean.TRUE.equals(studentRepository.existsByEmail(student.getEmail()))) throw new EntityExistsException();
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id){
         studentRepository.deleteById(id);
    }
}
