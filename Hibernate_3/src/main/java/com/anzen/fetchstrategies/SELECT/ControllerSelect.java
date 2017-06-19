package com.anzen.fetchstrategies.SELECT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSelect {

	// Inyeccion de dependencias del servicio
	@Autowired
	private ServicesSelect services;

	
	@RequestMapping(value = "/dataSelectFetch")
	public void consultaDatosSelect(){
		services.consultaDatosSelect();
	}
	
	
}
