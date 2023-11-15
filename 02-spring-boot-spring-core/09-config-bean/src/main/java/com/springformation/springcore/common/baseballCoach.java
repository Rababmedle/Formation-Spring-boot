package com.springformation.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class baseballCoach implements Coach{
public baseballCoach(){
    System.out.println("In constuctor :"+getClass().getSimpleName());
}
    @Override
    public String getdailyworkout() {
        return "spend 30 minuits in batting practice";
    }
}
