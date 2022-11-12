package com.alvincodes.Student.FullStack.service;

import com.alvincodes.Student.FullStack.model.Student;

import java.util.List;

public interface studentservicee {
    public Student SaveStudent(Student student);
    public List<Student> getAllStudents();
    public void delete(Integer id);

}
