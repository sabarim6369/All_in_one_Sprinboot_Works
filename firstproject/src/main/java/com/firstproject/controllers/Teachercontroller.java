package com.firstproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teachers")

public class Teachercontroller {
	@GetMapping

	public String getresponse() {
		return "Hello guys";
	}

}
