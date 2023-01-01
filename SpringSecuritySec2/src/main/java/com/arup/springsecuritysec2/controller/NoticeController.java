package com.arup.springsecuritysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
    @GetMapping("/notice")
    public String getNoticeDetails(){
        return "Welcome ... notice";
    }
}
