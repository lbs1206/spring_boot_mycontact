package com.fastcampus.javaallinone.project3.mycontact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        return "HelloWorld";
    }
}
