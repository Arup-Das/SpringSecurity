package com.arup.springsecuritysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loan")
    public String getLoanDetails(){
        return "Welcome ... loan";
    }
}
