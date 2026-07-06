package com.example.demo.model;

public class BookPractice {
    // define properties
    private Long id;
    private String title;
    private String author;
    private double price;
    private String year;


    // define no argument constructor
    public BookPractice() {}

    // define argument constructor
    public BookPractice(Long id, String title, String author, double price, String year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    // getter and setter method

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
