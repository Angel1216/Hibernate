package com.anzen.fetchstrategies.SUBSELECT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSubSelect {

	// Inyeccion de dependencias del servicio
	@Autowired
	private ServicesSubSelect serviceSubSelect;
	
	
	@RequestMapping(value = "/dataSubSelectFetch")
	public void consultaDatosSelect(){
		serviceSubSelect.consultaDatosSubSelect();
	}
}
