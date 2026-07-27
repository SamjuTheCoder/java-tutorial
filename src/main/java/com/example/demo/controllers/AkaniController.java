package com.example.demo.controllers;

import com.example.demo.model.Akani;
import com.example.demo.request.AkaniRequest;
import com.example.demo.services.AkaniService;
import com.example.demo.response.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController - This class will receive HTTP requests (such as GET, POST, PUT, and DELETE) from users or applications and return data, usually in JSON format
//JSON - JavaScript Object Notation
//Controller - A Controller is a Java class that handles requests from users.
//The REST part means the controller is designed to send data instead of web pages.
@RestController

//@RequestMapping("/api/v1") - It tells Spring Boot the base URL (address) that should be used for all the methods inside a controller.
//URL - Uniform Resource Locator
@RequestMapping("/api/v1")
public class AkaniController {




}
