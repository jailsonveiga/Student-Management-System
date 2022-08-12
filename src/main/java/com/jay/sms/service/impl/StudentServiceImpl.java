package com.jay.sms.service.impl;

import com.jay.sms.entity.Student;
import com.jay.sms.repository.StudentRepository;
import com.jay.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
