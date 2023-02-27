package com.product.entity1.Hibernate_Mappings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory sf=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	        Session s=sf.openSession();
	        Transaction tx=s.beginTransaction();
	        QuestionM qm=new QuestionM();
	        qm.setId(101);
	        qm.setQuestion("What is java?");
	        
	        AnswerM a=new AnswerM();
	        a.setId(201);
	        a.setAnswer("Java is Object Oriented Language");
	        a.setQ(qm);
	        
	        AnswerM a1=new AnswerM();
	        a1.setId(202);
	        a1.setAnswer("Java is high level Language");
	        a1.setQ(qm);
	        
	        AnswerM a2=new AnswerM();
	        a2.setId(203);
	        a2.setAnswer("Java is plat form independent");
	        a2.setQ(qm);
	        
	        List<AnswerM> list=new ArrayList();
	        list.add(a);
	        list.add(a1);
	        list.add(a2);
	       qm.setAns(list);
	       s.save(a);
	       s.save(a1);
	       s.save(a2);
	       s.save(qm);
	       tx.commit();
	       s.close();
	        
	}

}
