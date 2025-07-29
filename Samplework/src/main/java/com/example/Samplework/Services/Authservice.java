package com.example.Samplework.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Samplework.Modals.Authmodal;
import com.example.Samplework.Repositories.Authrepo;
import java.util.*;
@Service
public class Authservice {

    @Autowired
    private Authrepo authrepo;

    // Method to save Authmodal object
    public String addAuthData(Authmodal authmodal) {
        try {
            authrepo.save(authmodal);  // Save the Authmodal object to MongoDB
            return "Data saved successfully!";
        } catch (Exception e) {
            return "Error saving data: " + e.getMessage();
        }
    }
    public List<Authmodal> finddata() {
      return authrepo.findAll();
    }

}
