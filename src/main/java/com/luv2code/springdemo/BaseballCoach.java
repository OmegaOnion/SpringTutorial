package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService f){
        this.fortuneService = f;
    }

    @Override
    public String getDailyWorkout(){
        return "yeet for 30mins baller";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
