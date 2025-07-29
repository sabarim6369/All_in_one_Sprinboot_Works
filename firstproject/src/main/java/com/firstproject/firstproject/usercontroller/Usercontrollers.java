package com.firstproject.firstproject.usercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontrollers {
	@GetMapping
	 public String getUsers() {
        return "Hello world";
    }

}


