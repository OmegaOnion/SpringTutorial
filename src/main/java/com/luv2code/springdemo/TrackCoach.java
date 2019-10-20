package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService f){
        this.fortuneService = f;
    }
    // no arg constructor
    public TrackCoach(){
        
    }

    @Override
    public String getDailyWorkout() {
        return "run homie";
    }

    @Override
    public String getDailyFortune() {
        return "Here's the track fortune: " + this.fortuneService.getFortune();
    }
    //hooks
    // create init method
    public void doMyStartupStuff(){
        System.out.println("Track coach startup");
    }
    // create destroy method
    public void doMyDestroyStuff() {
        System.out.println("Track coach destroy");
    }
}
