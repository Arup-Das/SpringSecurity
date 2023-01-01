package com.arup.springsecuritysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ContactController {
    @GetMapping("/contact")
    public String getContactDetails(){
        return "Welcome ... contact";
    }
}
