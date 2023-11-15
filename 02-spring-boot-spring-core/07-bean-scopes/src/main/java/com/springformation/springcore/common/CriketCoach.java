package com.springformation.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class CriketCoach  implements Coach{
    public CriketCoach(){
        System.out.println("In constuctor :"+getClass().getSimpleName());
    }
    @Override
    public String getdailyworkout() {
        return "Practice fast bowling for 15 minuits!!!!!";
    }
}
