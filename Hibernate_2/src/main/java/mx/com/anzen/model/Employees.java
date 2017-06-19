package mx.com.anzen.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mx.com.anzen.bean.Employee;


public class Employees {
	
	
	public Session getSessionFactory(){
		
		// Configuration
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	return session;
	}
	
	
	public String insertEmployee(){
		
		// Varaibles
		String result = "";
		
		// Obtener session
		Session session = getSessionFactory();
		
    	try{	
	    	// Bean
	    	Employee employee = new Employee();
	    	employee.setEmpName("PorFin desde Hibernate_2");
	    	employee.setBranch("Pune");
	    	
	    	// Transacction
	    	Transaction trx = session.beginTransaction();
	    	session.save(employee);
	    	trx.commit();
	    	
	    	result = "successfully saved";
	    	
		} catch(Exception ex){
			
			result = ex.getMessage().toString();
			System.out.print("result: ");
			System.out.println(result);
			
		} finally{
			
			if(session!=null){
				session.close();
			}
			
		}
		
    	return result;
	}
	
}
