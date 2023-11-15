package com.springformation.springcore.config;

import com.springformation.springcore.common.Coach;
import com.springformation.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Sportconfig {
    @Bean("test")
    public Coach swimcoach(){
        return new SwimCoach();

    }
}
