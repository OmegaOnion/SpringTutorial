package com.luv2code.springdemo;

        import java.util.Random;

public class RandomFortuneService implements FortuneService{

    // possible fortunes
    private String[] fortunes = {"Your day is gonna be great", "Your day is gonna suck",
            "You will be disapointed with your fortune"};

    @Override
    public String getFortune() {
        //RNG
        Random rand = new Random();
        int x = rand.nextInt(3);
        return fortunes[x];
    }
}
