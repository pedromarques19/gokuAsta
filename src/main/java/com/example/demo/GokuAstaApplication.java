package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GokuAstaApplication {

	@Value ("${numeroAleatorio}")
	int numeroAleatorio;

	public static void main(String[] args) {
		SpringApplication.run(GokuAstaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner () {

		return args -> {
			BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
			System.out.println(bCryptEncoder.encode(Integer.toString(numeroAleatorio)));
			System.out.println(bCryptEncoder.encode(Integer.toString(numeroAleatorio)));
			System.out.println(bCryptEncoder.matches(Integer.toString(numeroAleatorio),bCryptEncoder.encode(Integer.toString(numeroAleatorio))));
		};


	}


}
