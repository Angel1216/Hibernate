package com.anzen.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.anzen.bean.Book;
import com.anzen.service.EmployeesService;

@RestController
public class EmployeesController {

	// Inyeccion de dependencias del servicio
	@Autowired
	private EmployeesService employeesService;
	
	
	@RequestMapping(value = "/insertEmployee")
	public String getAllBooks() {
		return employeesService.insertEmployee();
	}
}
