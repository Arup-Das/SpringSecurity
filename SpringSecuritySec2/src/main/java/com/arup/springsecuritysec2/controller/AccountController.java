package com.arup.springsecuritysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account")
    public String getAccountDetails(){
        return "Welcome ... account";
    }
}
