package com.algartech.clima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.algartech.clima.entity"})  // scan JPA entities manually
public class ClimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaApplication.class, args); 
	}

}
