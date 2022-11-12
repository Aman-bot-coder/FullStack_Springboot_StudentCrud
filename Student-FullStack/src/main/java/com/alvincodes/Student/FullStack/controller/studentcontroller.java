package com.alvincodes.Student.FullStack.controller;

import com.alvincodes.Student.FullStack.model.Student;
import com.alvincodes.Student.FullStack.service.studentservicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/student")
public class studentcontroller {
    @Autowired
    private studentservicee StudentService;
//    private Object student;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        StudentService.SaveStudent(student);
        return "new student added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return StudentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id){
        try{
            Student student = StudentService.getAllStudents().get(id);
            return new ResponseEntity<Student>(student,HttpStatus.OK);

        }catch(NoSuchElementException e){
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> update(ResponseBody Student  ,@PathVariable Integer id){
        try{
            Student existingStudent = StudentService.getAllStudents().get(id);
            StudentService.SaveStudent(new Student());
            return new ResponseEntity<Student>(HttpStatus.OK);

        }catch(NoSuchElementException e){
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
         StudentService.delete(id);
    }




}
