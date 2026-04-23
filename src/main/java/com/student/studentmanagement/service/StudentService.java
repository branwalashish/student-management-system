package com.student.studentmanagement.service;

import com.student.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}