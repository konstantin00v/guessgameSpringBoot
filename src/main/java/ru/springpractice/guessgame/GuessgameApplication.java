package ru.springpractice.guessgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

@SpringBootApplication
public class GuessgameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GuessgameApplication.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		GetRandomInteger randInt = (GetRandomInteger) context.getBean(GetRandomInteger.class);
		int randomizeNumber = randInt.getRandomInt();
		ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));

		Scanner sc = new Scanner(System.in);

		System.out.println(rsrcbndl.getString("start")
				+ "\n" + rsrcbndl.getString("starttry")
				+ "\n" + rsrcbndl.getString("entr"));
		while (true) {
			int number = sc.nextInt();
			if ( number > randomizeNumber ) {
				context.publishEvent(GuessEventLess.less());
			} else if ( number < randomizeNumber) {
				context.publishEvent(GuessEventMore.more());
			} else break;
		}
		System.out.println(rsrcbndl.getString("figuredOut") + " " + randomizeNumber);
		sc.close();

	}

}
