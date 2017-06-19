package com.anzen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anzen.dao.Employees;

@Service
public class EmployeesServiceImpl implements EmployeesService{

	@Autowired
	private Employees employees;
	
	@Override
	public String insertEmployee() {
		return employees.insertEmployee();
	}

}
