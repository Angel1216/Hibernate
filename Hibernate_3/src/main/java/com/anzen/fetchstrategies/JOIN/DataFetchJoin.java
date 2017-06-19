package com.anzen.fetchstrategies.JOIN;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anzen.fetchstrategies.Person;
import com.anzen.fetchstrategies.Address;


@Repository
@Transactional 
public class DataFetchJoin {
	
	// Se recupera el sessionFactory
	@Autowired  
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {  
	  this.sessionFactory = sf;  
	}
		
 
	public void consultaDatosJoin() {
        
		Session session = sessionFactory.getCurrentSession();
         
        Person p = (Person)session.get(Person.class, 1);
         
        System.out.println("Retrieving Data");
        System.out.println(p);
        System.out.println("Address retrieval initiated.");
        List<Address> addresses = p.getAddresses();
        System.out.println("Address retrieval complete.");
        int i=1;
        for (Address address : addresses) {
            System.out.println("#### individual address: " + i);
            System.out.println(address);
            System.out.println("#### Address complete");
            i++;
        }
    }
}