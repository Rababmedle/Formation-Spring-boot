package com.formation.springboot.myapp1.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//expose "/" that return hello word
@RestController
public class FunrestController {
    //inject propriets for:coach.name and team.name
   @Value("${coach.name}")
    public String coachName;
    @Value("${team.name}")
    public String teamName;

    //expose new endpoint for teaminfo

    @GetMapping("/teaminfo")
    public String teaminfo(){
        return "coach:"+coachName+ "team:"+teamName;
    }
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

