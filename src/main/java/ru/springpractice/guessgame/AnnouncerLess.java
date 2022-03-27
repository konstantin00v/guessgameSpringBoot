package ru.springpractice.guessgame;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;
@Component
public class AnnouncerLess implements ApplicationListener<GuessEventLess> {
    public static ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));

    @Override
    public void onApplicationEvent(GuessEventLess event) {
        System.out.println(rsrcbndl.getString("lessPhrase"));
    }
}
