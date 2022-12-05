package com.example.Library_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Library_Controller {


    @PostMapping("/")
    public String AdminLogin()
    {
        return "adminlogin";
    }

    @GetMapping("/view")
    public String View()
    {
        return "Viewpage";
    }

    @PostMapping("/edit")
    public String Edit()
    {
        return "Editpage";
    }

    @PostMapping("/search")
    public String Search()
    {
        return "Searchpage";
    }

    @PostMapping("/delete")
    public String Delete()
    {
        return "Deletepage";
    }

    @PostMapping("/userlogin")
    public String UserLogin()
    {
        return "Userlogin page";
    }

    @PostMapping("/issue")
    public String Issue()
    {
        return "Issuepage";
    }

    @PostMapping("/usersignup")
    public String UserSignUp()
    {
        return "Usersignuppage";
    }

    @PostMapping("/entry")
    public String Entry()
    {
        return "Entrypage";
    }

}
