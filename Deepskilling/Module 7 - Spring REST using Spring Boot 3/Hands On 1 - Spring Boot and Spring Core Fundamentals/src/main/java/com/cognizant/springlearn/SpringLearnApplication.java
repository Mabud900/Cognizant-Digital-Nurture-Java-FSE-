package com.cognizant.springlearn;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringLearnApplication.class, args);
        System.out.print("Startup Date "+new Date(context.getStartupDate()));
    }

}
