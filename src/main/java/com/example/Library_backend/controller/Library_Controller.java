package com.example.Library_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Library_Controller {


    @PostMapping("/")
    public String AdminLogin()
    {
        return "adminlogin";
    }
}
