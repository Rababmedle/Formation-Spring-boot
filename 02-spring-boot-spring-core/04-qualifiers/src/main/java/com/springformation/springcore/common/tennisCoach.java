package com.springformation.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach{
    @Override
    public String getdailyworkout() {
        return "Practice your backhand volley";
    }
}
