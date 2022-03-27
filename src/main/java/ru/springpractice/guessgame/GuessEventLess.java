package ru.springpractice.guessgame;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.ResourceBundle;

public class GuessEventLess extends ApplicationEvent {

    public GuessEventLess(Object source) {
        super(source);
    }
     public static ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));
    @Bean
    public static GuessEventLess less()  {
        return new GuessEventLess(new GuessEventData());
    }
//    @Bean
//    public static GuessEvent more() {
//        String s = rsrcbndl.getString("morePhrase");
//        return new GuessEvent(new GuessEventData(s)) ;
//    }

}
