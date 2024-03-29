package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){
        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from container
        CricketCoach myCoach  = context.getBean("myCricketCoach", CricketCoach.class);
        // call methods on bean
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getEmailAddress());
        System.out.println(myCoach.getTeam());
        // close context
        context.close();
    }
}
