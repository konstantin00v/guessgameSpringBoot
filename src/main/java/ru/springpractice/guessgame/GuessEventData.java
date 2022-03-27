package ru.springpractice.guessgame;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;

@Component
@Primary
public class GuessEventData {
    private final LocalDateTime createdAt;

    public GuessEventData() {
        createdAt = LocalDateTime.now();
    }
}
