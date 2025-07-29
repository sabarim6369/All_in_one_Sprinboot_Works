package com.mongodbwithSpringboot.Mongodbwithspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodbwithSpringboot.Mongodbwithspringboot.modal.Teachermodal;
import com.mongodbwithSpringboot.Mongodbwithspringboot.repository.Teacherrepo;

@RestController
public class Teachercontroller {
    
    @Autowired
    Teacherrepo teacherrepo;

    // GET endpoint to fetch all teachers
    
    @GetMapping("/getallteachers")
    public List<Teachermodal> getallteacher() {
        return teacherrepo.findAll();
    }
    @PostMapping("/addteachers")
    public void addteachers(@RequestBody Teachermodal teacher) {
    teacherrepo.save(teacher);
    }
}
