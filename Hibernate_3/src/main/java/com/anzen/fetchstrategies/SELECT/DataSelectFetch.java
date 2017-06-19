package com.anzen.fetchstrategies.SELECT;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anzen.fetchstrategies.Person;
import com.anzen.fetchstrategies.Address;

@Repository
@Transactional
public class DataSelectFetch {

	// Se recupera el sessionFactory
	@Autowired  
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {  
	  this.sessionFactory = sf;  
	}
	
		
	public void consultaDatosSelect() {
        
		Session session = sessionFactory.getCurrentSession();
         
        Query q = session.createQuery(" FROM Person p ");
         
        System.out.println("Retrieving Data");
        List l = q.list();
        System.out.println("Data retrieved: " + l.size());
        
        for (Object object : l) {
            Person p = (Person) object;
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
}