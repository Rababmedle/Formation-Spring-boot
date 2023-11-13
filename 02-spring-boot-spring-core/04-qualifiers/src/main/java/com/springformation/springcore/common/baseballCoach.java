package com.springformation.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class baseballCoach implements Coach{

    @Override
    public String getdailyworkout() {
        return "spend 30 minuits in batting practice";
    }
}
