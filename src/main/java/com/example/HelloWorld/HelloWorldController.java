package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/name")
    public String index(){
        return "Justin Nahorny";
    }
    @RequestMapping("/")
    public String index1(){
        return "Hello World from the terminal!";
    }
}
