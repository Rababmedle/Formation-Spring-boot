package com.springformation.springcore;

import org.springframework.stereotype.Component;

@Component
public class CriketCoach  implements Coach{
    @Override
    public String getdailyworkout() {
        return "Practice fast bowling for 15 minuits";
    }
}
