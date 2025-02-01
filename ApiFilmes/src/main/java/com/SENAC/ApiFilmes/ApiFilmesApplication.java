package com.SENAC.ApiFilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.SENAC.ApiFilmes.repository")
public class ApiFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFilmesApplication.class, args);
	}
}
