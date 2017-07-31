package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by tj on 2017/7/4.
 */

@RestController
@RequestMapping("/")
public class Hello {
    //RequestMapping  可在浏览器中用url获取
    @RequestMapping("home")
    public String value(){
        return "Hello wrold";
    }

    //PostMapping 只可通过post方法获取
    @PostMapping("message/{messageId}")
    public String postMessage(@PathVariable("messageId") String messageId){
        return messageId;
    }

    //GetMapping 只可通过get方法获取
    @GetMapping("message/{messageId}")
    public String getMessage(@PathVariable("messageId") String messageId){
        return messageId;
    }

    @PostMapping("message/search")
    public String searchMessage(@RequestBody String str){
        return str;
    }
}
