package com.springformation.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach{
    public tennisCoach(){
        System.out.println("In constuctor :"+getClass().getSimpleName());
    }
    @Override
    public String getdailyworkout() {
        return "Practice your backhand volley";
    }
}
