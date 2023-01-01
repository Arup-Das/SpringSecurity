package com.arup.springsecuritysec2.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NoticeController {
    @GetMapping("/notice")
    public String getNoticeDetails(){
        return "Welcome ... notice";
    }
}
