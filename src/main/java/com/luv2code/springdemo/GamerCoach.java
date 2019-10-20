package com.luv2code.springdemo;

public class GamerCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Go get it gamer";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
