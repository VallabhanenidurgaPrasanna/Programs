package com.Bitlabs.entity.Hibernate_Mapmany;

import java.util.ArrayList;
import java.util.List;

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
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        Employee e1=new Employee();
        e1.setId(101);
        e1.setEname("Durga");
        Employee e2=new Employee();
        e2.setId(102);
        e2.setEname("prasanna");
        
        Project p1=new Project();
        p1.setId(201);
        p1.setPname("Java");
        Project p2=new Project();
        p2.setId(202);
        p2.setPname("Python");
        
        List<Employee> list1=new ArrayList();
        list1.add(e1);
        list1.add(e2);
        
        List<Project> list2=new ArrayList();
        list2.add(p1);
        list2.add(p2);
        
        e1.setP(list2);
        e2.setP(list2);
        p1.setE(list1);
        p2.setE(list1);
        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);
        tx.commit();
        s.close();
    }
}
