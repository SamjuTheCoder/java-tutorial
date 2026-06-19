package com.example.demo.services;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    private final Map<String, Book> books = new HashMap<>();

    public BookService(){
        books.put("1", new Book(1L, "Book 1", "Book 1 description"));
        books.put("2", new Book(2L, "Book 2", "Book 2 description"));
        books.put("3", new Book(3L, "Book 3", "Book 3 description"));
        books.put("4", new Book(4L, "Book 4", "Book 4 description"));
    }

    public boolean deleteBook(Long id){
        return books.remove(id) != null;
    }
}
