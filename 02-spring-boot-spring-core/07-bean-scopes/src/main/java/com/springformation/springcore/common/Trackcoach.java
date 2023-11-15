package com.springformation.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Trackcoach implements Coach{
    public Trackcoach(){
        System.out.println("In constuctor :"+getClass().getSimpleName());
    }
    @Override
    public String getdailyworkout() {
        return "Run hard 5k";
    }
}

