package com.alvincodes.Student.FullStack.service;

import com.alvincodes.Student.FullStack.model.Student;
import com.alvincodes.Student.FullStack.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentserviceimplementation implements studentservicee{
    @Autowired
    private studentrepo StudentRepo;
    @Override
    public Student SaveStudent(Student student) {
        return StudentRepo.save(student);
    }


    @Override
    public List<Student> getAllStudents() {
        return StudentRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        StudentRepo.deleteById(id);
    }

//    @Override
//    public Student saveStu(Student student) {
//        return StudentRepo.save(student);
//    }
}
