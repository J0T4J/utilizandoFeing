package com.agendatelefonica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Agendatelefonica2Application {

	public static void main(String[] args) {
		SpringApplication.run(Agendatelefonica2Application.class, args);
	}

}
