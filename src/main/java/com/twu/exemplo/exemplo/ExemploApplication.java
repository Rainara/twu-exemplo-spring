package com.twu.exemplo.exemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploApplication {

	private int num;
	private int idade;

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}
}
