package com.example.demo.controllers;

import com.example.demo.response.ApiResponse;
import com.example.demo.services.BookServicePractice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class BookControllerPractice {

    //dependency injection
    private final BookServicePractice bookServicePractice;

    // constructor dependency injection
    public BookControllerPractice(BookServicePractice  bookServicePractice) {
        this.bookServicePractice = bookServicePractice;
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteBookPractice(@PathVariable Long id) {
        boolean deleted = bookServicePractice.deleteBookPractice(id);

        if (deleted) {
            return new ApiResponse(
                    "Successfully deleted BookPractice with id: " + id,
                    "00",
                    deleted
            );
        }

        else {
            return new ApiResponse(
                    "unable to delete BookPractice with id: " + id,
                    "E01",
                    deleted
            );
        }

    }

}





