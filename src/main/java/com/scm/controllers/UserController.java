package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/user")
public class UserController {

    // Dashboard page: Support both GET and POST
    @RequestMapping(value = "/dashboard", method = {RequestMethod.GET, RequestMethod.POST})
    public String userDashboard() {
        return "user/dashboard";
    }

    // User profile page
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String userProfile() {
        return "user/profile";
    }
    
    // user add contact page

    // user view contacts

    // user edit contacts

    // delete contact page
}
