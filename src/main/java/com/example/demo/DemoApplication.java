package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Demo first");
		System.out.println("Demo second");
		System.out.println("Demo Third"); 
		SpringApplication.run(DemoApplication.class, args);
	}

}
