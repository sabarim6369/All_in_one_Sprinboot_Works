package com.firstproject.new1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user12")
public class Userscontroller {
	@GetMapping
	 public String getUsers() {
        return "Hello world";
    }
	

}
