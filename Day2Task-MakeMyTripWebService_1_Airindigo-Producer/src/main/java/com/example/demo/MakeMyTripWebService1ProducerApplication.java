package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MakeMyTripWebService1ProducerApplication {

	public static void main(String[] args) {
		System.out.println("make my trip airlines");
		SpringApplication.run(MakeMyTripWebService1ProducerApplication.class, args);
	}
	
}
