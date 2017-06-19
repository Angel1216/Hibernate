package com.anzen.fetchstrategies.JOIN;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
@Transactional
public class DataOuterJoinFetch {
 
	// Se recupera el sessionFactory
	@Autowired  
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {  
	  this.sessionFactory = sf;  
	}
	
	
	public void consultaDatosOuterJoin() {
        
		Session session = sessionFactory.getCurrentSession();
         
        Query q = session.createQuery(" SELECT p, a FROM Person as p left outer join p.addresses a where p.id = a.personId");
         
        System.out.println("Retrieving Data");
        List l = q.list();
        System.out.println("Result size: " + l.size());
        System.out.println("Data retrieved");
        for (Object object : l) {
            if (object instanceof Object[]) {
                Object[] objArr = (Object[]) object;
                System.out.println("Person");
                System.out.println(objArr[0]);
                System.out.println("Address");
                System.out.println(objArr[1]);
            } else {
                throw new RuntimeException("Unable to process.");
            }
        }
 
    }
}