package com.formation.springboot.myapp1.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//expose "/" that return hello word
@RestController
public class FunrestController {
    @GetMapping("/")
    public String sayhello(){
        return "hello world";
    }
//expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyworkout(){
        return "Run a hard 5k";
    }
    //expose a new endpoint for fortune

    @GetMapping("/fortune")
    public String getDailyfortune(){
        return "today is your lucky day.";
    }



}
//

