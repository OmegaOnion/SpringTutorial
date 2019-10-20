package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;



    private String emailAddress;
    private String team;

    public CricketCoach(){
        System.out.println("Cricket coach: no arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "be the best but lose but win cricket btw";
    }

    @Override
    public String getDailyFortune() {
        return getFortuneService().getFortune();
    }

    public void setFortuneService(FortuneService f){
        System.out.println("CricketCoach set fortuneServuce");
        this.fortuneService = f;
    }

    public FortuneService getFortuneService(){
        return this.fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach setTeam");
        this.team = team;
    }
}
