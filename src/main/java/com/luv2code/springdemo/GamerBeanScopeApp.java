package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GamerBeanScopeApp {
    public static void main(String[] args){
        // create context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("gamerBeanScope-applicationContext.xml");
        // get beans
        //singleton beans
        Coach aCoach = context.getBean("mySingletonCoach", Coach.class);
        Coach bCoach = context.getBean("mySingletonCoach", Coach.class);
        //prototype beans
        Coach cCoach = context.getBean("myPrototypeCoach", Coach.class);
        Coach dCoach = context.getBean("myPrototypeCoach", Coach.class);
        // use beans

        System.out.println("Singleton beans are the same: " + (aCoach == bCoach));

        System.out.println("Prototype beans are not: " + (cCoach == dCoach));

        // close context
        context.close();
    }
}
