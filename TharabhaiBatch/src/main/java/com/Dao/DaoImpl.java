package com.Dao;

import java.util.*;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.entity.TharabhaiBatch.Tharabhai;

public class DaoImpl implements DaoInterface{
 
	public void insert() {
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=new Configuration().configure("com/employee/entity/TharabhaiBatch/hibernate.cfg.xml").buildSessionFactory();
		
		Tharabhai obj=new Tharabhai();
		System.out.println("enter name");
		String name=sc.nextLine();
		obj.setName(name);
		System.out.println("enter email");
		String email=sc.next();
		obj.setEmail(email);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		obj.setMarks(marks);
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(obj);
		System.out.println("Inserted successfully");
		tx.commit();
		s.close();
	}

	public void getAllStudents() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/TharabhaiBatch/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Tharabhai");
		List<Tharabhai> list=new ArrayList();
		list=query.list();
		for(Tharabhai x: list) {
			System.out.println(x.getId()+"  "+x.getName()+"  "+x.getEmail()+"  "+x.getMarks());
		}
		s.close();
	}

	public void update(int id,String name) {
		SessionFactory sf=new Configuration().configure("com/employee/entity/TharabhaiBatch/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Tharabhai obj=s.get(Tharabhai.class, id);	
		obj.setName(name);		
		Transaction tx=s.beginTransaction();
		s.save(obj);
		System.out.println("updated data successfully");
		tx.commit();
		s.close();
	}

	public void getById(int id) {
		SessionFactory sf=new Configuration().configure("com/employee/entity/TharabhaiBatch/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();		
	    Tharabhai obj=s.get(Tharabhai.class, id); 		
		System.out.println(obj);
		Transaction tx=s.beginTransaction();
		s.save(obj);
		tx.commit();
		s.close();
		
	}

	public void deleteById(int id) {
		SessionFactory sf=new Configuration().configure("com/employee/entity/TharabhaiBatch/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();	
	    Tharabhai obj=s.get(Tharabhai.class, id);
		System.out.println(obj);
		Transaction tx=s.beginTransaction();
		s.delete(obj);
		System.out.println("deleted data successfully");
		tx.commit();
		s.close();	
		
	}

}
