package com.anzen.fetchstrategies.SUBSELECT;

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
public class DataSubSelectFetch {

	// Se recupera el sessionFactory
	@Autowired  
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {  
	  this.sessionFactory = sf;  
	}
	
		
	public void consultaDatosSubSelect() {
        
		Session session = sessionFactory.getCurrentSession();
         
        Query q = session.createQuery(" FROM Person p ");
		
//		Query q = session.createQuery(" FROM Person p WHERE p.id = ? OR p.id = ?");
//		q.setInteger(0, 1);
//		q.setInteger(1, 2);

         
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