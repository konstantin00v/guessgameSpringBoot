package ru.springpractice.guessgame;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;
@Component
public class GetRandomInteger {

    private final int randomInt;

    public int getRandomInt() {
        return randomInt;
    }

    public GetRandomInteger() {
        randomInt = ThreadLocalRandom.current().nextInt(
                0, 1001);;
//        System.out.println(randomInt);
    }

}
