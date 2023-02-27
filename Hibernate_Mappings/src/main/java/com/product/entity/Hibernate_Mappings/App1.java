package com.product.entity.Hibernate_Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 {

	public static void main(String[] args) {
		 SessionFactory sf=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	        Session s=sf.openSession();
	        Transaction tx=s.beginTransaction();
	        
	        
	        
	        Answer1 a=new Answer1();
	       
	        a.setId(110);
	        a.setAnswer("Java is Object Oriented Language");
	        
	        
	       
	       
	        Question1 que=new Question1();
	        que.setId(201);
	        que.setQuestion1("what is java");
	        que.setAns(a);
	        a.setQ(que);
	       
	        s.save(a);
	        s.save(que);
	        tx.commit();
	        s.close();
	      
	       
	}

}
