package com.thoughtworks.training.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringAppRunner implements ApplicationRunner {
    @Autowired
    public void run(ApplicationArguments args){
        System.out.print("hello");

    }
}
