package com.anzen.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anzen.bean.Employee;

import javax.transaction.Transactional;

//Importar librerias de HIBERNATE
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
@Transactional
public class Employees {
	
	// Se recupera el sessionFactory
	@Autowired  
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {  
		  this.sessionFactory = sf;  
	}


	// Metodos
	public String insertEmployee(){
		 
		Session session = this.sessionFactory.getCurrentSession();
		
		// Varaibles
		String result = "";
		 
		// Bean
    	Employee employee = new Employee();
    	employee.setEmpName("Hibernate_3 Spring Boot");
    	employee.setBranch("Pune");
	    
    	session.save(employee);

    	return result = "successfully saved";
	 }
	
}
