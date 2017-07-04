package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tj on 2017/7/4.
 */

@RestController
public class Hello {
    @RequestMapping("/")
    public String value(){
        return "Hello wrold";
    }
}
