package com.example.crms;
public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private String aadharNumber;

    public User() {
        // Default constructor required for Firebase
    }

    public User(String name, String email, String phoneNumber, String password, String aadharNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.aadharNumber = aadharNumber;
    }

    // Getter and setter methods for 'name' field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for 'email' field
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for 'phoneNumber' field
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter methods for 'password' field
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter methods for 'aadharNumber' field
    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}
