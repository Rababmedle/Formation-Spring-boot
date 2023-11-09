package com.formation.springboot.myapp1.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunrestController {
    @GetMapping("/")
    public String sayhello(){
        return "hello world";
    }

}
