package com.mongodbwithSpringboot.Mongodbwithspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodbwithSpringboot.Mongodbwithspringboot.modal.Students;
import com.mongodbwithSpringboot.Mongodbwithspringboot.repository.Studentrepo;
import java.util.List;

@RestController
public class Maincontrollers {

    @Autowired
    Studentrepo studentrepo;

    // Post method for adding student
    @PostMapping("/adduser")
    public String registerdata(@RequestBody Students student) {
        studentrepo.save(student);
        return "Student added successfully!";
    }

    // Get method for fetching all students
    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentrepo.findAll(); // This will return all students in the collection
    }
}
