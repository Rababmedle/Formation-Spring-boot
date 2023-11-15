package com.springformation.springcore.rest;

import com.springformation.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
   @Autowired
   public DemoController(@Qualifier("baseballCoach") Coach theCoach){
       System.out.println("In constuctor :"+getClass().getSimpleName());
       myCoach=theCoach;}
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach=theCoach;}
//  }
//@Autowired
//public void  setcoach(Coach theCoach){
//    myCoach=theCoach;
//}
    @GetMapping("/getdailyworkout")
    public String getdailyworkout(){
        return myCoach.getdailyworkout();
    }
}
