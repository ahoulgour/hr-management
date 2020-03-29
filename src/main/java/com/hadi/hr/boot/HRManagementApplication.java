package com.hadi.hr.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hadi.hr.infrastructure.configuration")
public class HRManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HRManagementApplication.class, args);
	}

}
