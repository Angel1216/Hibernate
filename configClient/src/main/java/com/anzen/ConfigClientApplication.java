package com.anzen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

	public static void main(String[] args) {SpringApplication.run(ConfigClientApplication.class, args);}
	
	@Value("${nombre}")
	private String nombre;
	
	@Value("${apellidop}")
	private String apellidop;
	
	@Value("${apellidom}")
	private String apellidom;
	
	@Value("${edad}")
	private String edad;
	
	
	@GetMapping()
	public String propiedades(){
		
		StringBuilder sb = new StringBuilder();
		sb.append(nombre+" ");
		sb.append(apellidop+" ");
		sb.append(apellidom+" ");
		sb.append(". Mi edad es: " + edad);
		
		return sb.toString();
	}
}
