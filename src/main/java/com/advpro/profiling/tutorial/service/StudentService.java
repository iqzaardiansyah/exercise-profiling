package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<StudentCourse> studentCourses = studentRepository.findAll().stream()
                .map(student -> studentCourseRepository.findByStudentId(student.getId()))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    
        return studentCourses;
    }

    public Student findStudentWithHighestGpa() {
        List<Student> students = studentRepository.findAll();
        Optional<Student> student = students.stream()
                .max((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()));
        return student.orElse(null);
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append(student.getName()).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }
}

