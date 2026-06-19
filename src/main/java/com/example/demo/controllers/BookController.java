package com.example.demo.controllers;

import com.example.demo.response.ApiResponse;
import com.example.demo.services.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    // constructor dependency injection
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteBook(@PathVariable Long id) {

        boolean deleted =  bookService.deleteBook(id);

        if(deleted){
            return new ApiResponse(
                    "Successfully deleted Book with id: " + id,
                    "00",
                    deleted
            );
        }
        else {
            return new ApiResponse(
                    "Unable to delete Book with id: " + id,
                    "E01",
                    deleted
            );
        }

    }
}
