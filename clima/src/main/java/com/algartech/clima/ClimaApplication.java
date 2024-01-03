package com.algartech.clima;
/**
 * Author fpiceno
 * Applicacion para el consumo de externas API y el manejo de 2 endpoint
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EntityScan(basePackages = {"com.algartech.clima.entity"})  // scan JPA entities manually
@ComponentScan(basePackages = {"com.algartech.clima.repository", "com.algartech.clima.repository.impl","com.algartech.clima"})
@EnableJpaRepositories(basePackages = {"com.algartech.clima.repository"})
public class ClimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaApplication.class, args); 
	}

}
