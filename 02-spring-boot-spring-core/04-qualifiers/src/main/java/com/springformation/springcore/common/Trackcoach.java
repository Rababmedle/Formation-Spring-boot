package com.springformation.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class Trackcoach implements Coach{

    @Override
    public String getdailyworkout() {
        return "Run hard 5k";
    }
}
