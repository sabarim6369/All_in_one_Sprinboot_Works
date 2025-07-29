package com.example.Samplework.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Samplework.Modals.Authmodal;
import com.example.Samplework.Repositories.Authrepo;
import com.example.Samplework.Services.Authservice;
@RestController
@RequestMapping("/auth")
public class Authcontroller {

    @Autowired
    private Authservice authservice;
    @Autowired
    private Authrepo authrepo;

    @PostMapping("/add")
    public ResponseEntity<String> addAuthController(@RequestBody Authmodal data) {
        // Call the service method to save the data
        String response = authservice.addAuthData(data);

        // Return an appropriate response
        if (response.contains("Error")) {
            return ResponseEntity.status(500).body(response);  // Return error response
        } else {
            return ResponseEntity.status(200).body(response);  // Return success response
        }
    }
    @GetMapping("/getdata")
    public ResponseEntity<List<Authmodal>> getdata() {
       return ResponseEntity.status(200).body(authrepo.findAll());
    }
}
