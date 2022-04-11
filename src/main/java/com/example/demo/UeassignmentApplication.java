package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
"com.example.services.Services", "com.example.demo.controls"})

@ComponentScan(basePackages={"com.example"})
public class UeassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UeassignmentApplication.class, args);
	}

}





