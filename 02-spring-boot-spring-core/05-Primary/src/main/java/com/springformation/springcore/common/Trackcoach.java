package com.springformation.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Trackcoach implements Coach{

    @Override
    public String getdailyworkout() {
        return "Run hard 5k";
    }
}
