package ru.springpractice.guessgame;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import java.util.Locale;
import java.util.ResourceBundle;

public class GuessEventMore extends ApplicationEvent {

        public GuessEventMore(Object source) {
            super(source);
        }
        public static ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));
        @Bean
        public static GuessEventMore more()  {
            return new GuessEventMore(new GuessEventData());
        }
}
