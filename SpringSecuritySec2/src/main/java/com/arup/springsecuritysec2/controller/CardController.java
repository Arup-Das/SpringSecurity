package com.arup.springsecuritysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CardController {
    @GetMapping("/card")
    public String getCardDetails(){
        return "Welcome ... card";
    }
}
