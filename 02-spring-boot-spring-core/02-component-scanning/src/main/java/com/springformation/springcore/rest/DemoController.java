package com.springformation.springcore.rest;

import com.springformation.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    @Autowired
    public DemoController(Coach theCoach){
        myCoach=theCoach;
    }
    @GetMapping("/getdailyworkout")
    public String getdailyworkout(){
        return myCoach.getdailyworkout();
    }
}
