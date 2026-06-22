package com.example.demo.model;

public class Vehicle {

    private int id;
    private String name;
    private String color;
    private String make;

    public Vehicle(){}

    public Vehicle(int id, String name, String color, String make) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.make = make;
    }

    // getter and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
