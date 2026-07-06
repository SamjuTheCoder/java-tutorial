package com.example.demo.services;

import com.example.demo.model.BookPractice;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookServicePractice {
    private final Map<String, BookPractice> bookPractices = new HashMap<>();

    public BookServicePractice(){
        bookPractices.put("1", new BookPractice(1L, "GSTBook", "Sammy", 55.2, "2026"));
        bookPractices.put("2", new BookPractice(2L, "MathBook", "Pepe", 80.5, "2025" ));
        bookPractices.put("3", new BookPractice(3L, "EngBook", "Ani", 45.9, "2024"));
        bookPractices.put("4", new BookPractice(4L, "JavaBook", "MrJ", 98.3, "2023"));
    }

    public boolean deleteBookPractice(Long id){
        return bookPractices.remove(id) != null;
    }
}
