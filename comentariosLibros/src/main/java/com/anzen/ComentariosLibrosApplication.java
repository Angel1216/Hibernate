package com.anzen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComentariosLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComentariosLibrosApplication.class, args);
	}
}
