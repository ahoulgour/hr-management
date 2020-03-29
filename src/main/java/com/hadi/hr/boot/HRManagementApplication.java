package com.hadi.hr.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = {
		"com.hadi.hr.infrastructure.configuration",
		"com.hadi.hr.application.controller",
		"com.hadi.hr.domain.service"})
@EnableJpaRepositories(value = {"com.hadi.hr.domain.repository"})
@EntityScan("com.hadi.hr.domain.entity")
public class HRManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HRManagementApplication.class, args);
	}

}
