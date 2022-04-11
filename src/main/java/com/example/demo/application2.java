package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={
"com.example.services.EmployeeServices", "com.example.demo.controlsemployee"})

@ComponentScan(basePackages={"com.example"})
public class application2 {

	public static void main(String[] args) {
		SpringApplication.run(application2.class, args);
	}
	
}




