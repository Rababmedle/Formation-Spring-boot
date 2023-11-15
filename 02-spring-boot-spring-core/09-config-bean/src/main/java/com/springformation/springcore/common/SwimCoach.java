package com.springformation.springcore.common;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In constuctor :"+getClass().getSimpleName());
    }

    public String getdailyworkout() {
        return "swim 1000 meters as a warm up";
    }
}
