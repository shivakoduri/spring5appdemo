package com.myprojects.spring5.examples.jokedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokedemoApplication.class, args);
	}
}
