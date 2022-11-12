package com.alvincodes.Student.FullStack.repository;

import com.alvincodes.Student.FullStack.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepo extends JpaRepository<Student,Integer> {

}
