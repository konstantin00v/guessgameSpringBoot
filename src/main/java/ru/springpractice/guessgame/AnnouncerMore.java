package ru.springpractice.guessgame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import java.util.Locale;
import java.util.ResourceBundle;

@Component
public class AnnouncerMore implements ApplicationListener<GuessEventMore> {
    public static ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));

    @Override
    public void onApplicationEvent(GuessEventMore event) {
        System.out.println(rsrcbndl.getString("morePhrase"));
    }
}

