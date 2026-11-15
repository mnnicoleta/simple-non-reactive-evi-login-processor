package com.example.evi.login.processor;

import org.springframework.boot.SpringApplication;

public class TestEviLoginProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.from(EviLoginProcessorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
