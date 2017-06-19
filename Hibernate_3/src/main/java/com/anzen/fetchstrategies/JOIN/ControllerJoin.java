package com.anzen.fetchstrategies.JOIN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJoin {

	// Inyeccion de dependencias del servicio
		@Autowired
		private ServicesJoin services;
		
		
		@RequestMapping(value = "/dataOuterJoinFetch")
		public void consultaOuterJoinSelect(){
			services.consultaOuterJoinSelect();
		}
		
		
		@RequestMapping(value = "/dataJoinFetch")
		public void consultaJoinSelect(){
			services.consultaJoinSelect();
		}
		
}
