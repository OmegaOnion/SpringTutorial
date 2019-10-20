package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String args[]){

        //load app context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
        // get beans
        Coach aCoach = context.getBean("myCoach", Coach.class);
        Coach bCoach = context.getBean("myCoach", Coach.class);

        // compare beans

        System.out.println("Same object? " + (aCoach == bCoach));

        System.out.println("memory location: " + aCoach);
        System.out.println("memory location: " + bCoach);

        //house keeping
        context.close();
    }
}
