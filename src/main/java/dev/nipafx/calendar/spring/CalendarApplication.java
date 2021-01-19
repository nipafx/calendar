package dev.nipafx.calendar.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration(proxyBeanMethods = false)
@Import(CalendarConfiguration.class)
public class CalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarApplication.class, args);
	}

}
