package com.example.Samplework.Modals;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authmodals") // Optional: Specify collection name
public class Authmodal {

    private String name;
    private String email;
    private int age;
    private String address;  // example additional field
    private String phoneNumber; // example additional field

    // Default constructor
    public Authmodal() {
    }

    // Constructor with parameters
    public Authmodal(String name, String email, int age, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString() method for debugging purposes
    @Override
    public String toString() {
        return "Authmodal{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
