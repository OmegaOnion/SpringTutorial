package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args){
        String CONTEXT_SRC = "applicationContext.xml";
        //load the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONTEXT_SRC);
        //retrieve bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call bean methods
        System.out.println(theCoach.getDailyWorkout());

        // call fortune
        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
}
}
