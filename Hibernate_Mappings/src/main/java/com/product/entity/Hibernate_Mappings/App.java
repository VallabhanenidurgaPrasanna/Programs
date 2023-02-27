package com.product.entity.Hibernate_Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sf=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        Answer a=new Answer();
        a.setId(111);
        a.setAnswer("Java is Object Oriented Language");
        Question q=new Question();
        q.setId(201);
        q.setQuestion("What is java");
        q.setAns(a);
        s.save(q);
        s.save(a);
        tx.commit();
        s.close();
    }
}
