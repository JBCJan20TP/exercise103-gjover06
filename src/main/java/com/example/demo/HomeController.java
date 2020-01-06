package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "hometemplate";
    }
}
