package com.springformation.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CriketCoach  implements Coach{
    public CriketCoach(){
        System.out.println("In constuctor :"+getClass().getSimpleName());




    }

    //define our init methode
    @PostConstruct
    public void domystartupstaff(){
         System.out.println("domystartupstaff :"+getClass().getSimpleName());
    }
    //define our destroy methode
    @PreDestroy
    public void domycleanupstaff(){
        System.out.println("domycleanupstaff :"+getClass().getSimpleName());
    }
    @Override
    public String getdailyworkout() {
        return "Practice fast bowling for 15 minuits!!!!!";
    }
}
