package com.capg.hcms.test_management_system;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HcmsDiagnosticTestManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmsDiagnosticTestManagementSystemApplication.class, args);
	}

	@Bean
	public Random getRandom()
	{
		return new Random();
	}
}
