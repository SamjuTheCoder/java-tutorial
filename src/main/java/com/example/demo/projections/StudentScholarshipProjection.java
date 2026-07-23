package com.example.demo.projections;

//This is the StudentScholarshipProjection class
public class StudentScholarshipProjection {
    private String firstName; //create a location that will store the firstName
    private String lastName;
    private String email;
    private String phoneNumber;

    //this is the class constructor
public StudentScholarshipProjection(String firstName, String lastName, String email, String phoneNumber) {
    this.firstName = firstName; //Store the value passed into the constructor in this object's firstName field.
    this.lastName = lastName; //this.lasName(field. instance variable), lastName(parameter)
    this.email = email;
    this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

    public String getLastName() {
    return lastName;
    }
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }

    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }

    public String getPhoneNumber() {
    return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }

}
