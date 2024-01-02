package com.algartech.clima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.algartech.clima.entity"})  // scan JPA entities manually
@ComponentScan(basePackages = {"com.algartech.clima.repository", "com.algartech.clima.repository.impl","com.algartech.clima"})
@EnableJpaRepositories(basePackages = {"com.algartech.clima.repository"})
public class ClimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaApplication.class, args); 
	}

}
