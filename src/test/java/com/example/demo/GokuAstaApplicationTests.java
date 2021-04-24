package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("Test")
class GokuAstaApplicationTests {

//	@Value("${numeroAleatorio}")
//	int numeroAleatorio;

	@Test
	void contextLoads() {
	}
/*
	@Test
	void Teste (){
		assertEquals(145,numeroAleatorio);
	}
*/
}
