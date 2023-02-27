package com.Dao;


import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.employee.entity.Employe123.Employe321;
public class DaoImpl implements Dao{
Scanner sc=new Scanner(System.in);
	public void insert() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employe321 obj=new Employe321();
		System.out.println("enter name");
		String name=sc.next();
		obj.setName(name);
		System.out.println("enter salary");
		int salary=sc.nextInt();
		obj.setSalary(salary);
		System.out.println("enter city");
		String city=sc.next();
		obj.setCity(city);
		s.save(obj);
		tx.commit();
		s.close();
		
	}

	public void viewAll() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Employe321");
		List<Employe321> list=new ArrayList();
		list=query.list();
		for(Employe321 e:list) {
			System.out.println(e.getEid()+"  "+e.getName()+"  "+e.getSalary()+"  "+e.getCity());
		}
		s.close();
		
		
	}

	public void update(int eid, String name) {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employe321 obj=s.get(Employe321.class, eid);
		obj.setName(name);
		s.save(obj);
		System.out.println("updated successfully");
		tx.commit();
		s.close();
	}

	public void searchById(int eid) {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employe321 obj=s.get(Employe321.class, eid);
		System.out.println(obj);
		s.save(obj);
		tx.commit();
		s.close();
	}

	public void deleteById(int eid) {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employe321 obj=s.get(Employe321.class, eid);
		System.out.println(obj);
		s.delete(obj);
		System.out.println("deleted successfully");
		tx.commit();
		s.close();	
		
	}
	public void listOfRecordsDesc() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Employe321 order by salary desc ");
		List<Employe321> list=new ArrayList();
		list=query.list();
		for(Employe321 e:list) {
			System.out.println(e.getEid()+"  "+e.getName()+"  "+e.getSalary()+"  "+e.getCity());
		}
		s.close();
	}
	public void listOfRecordsAsce() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Employe321 order by salary");
		List<Employe321> list=new ArrayList();
		list=query.list();
		for(Employe321 e:list) {
			System.out.println(e.getEid()+"  "+e.getName()+"  "+e.getSalary()+"  "+e.getCity());
		}
		s.close();
	}
	public void rangeOf() {
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		System.out.println("enter start value");
		int s1=sc.nextInt();
		System.out.println("enter stop value");
		int s2=sc.nextInt();
		Query query=s.createQuery("from Employe321 where salary between :start and :stop");
		query.setParameter("start",s1);
		query.setParameter("stop", s2);
		List<Employe321> list=new ArrayList();
		list=query.list();
		for(Employe321 e:list) {
			System.out.println(e.getEid()+"  "+e.getName()+"  "+e.getSalary()+"  "+e.getCity());
		}
		s.close();
	}
	public void displaySalary() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Employe321 where salary>15000");
		List<Employe321> list=new ArrayList();
		list=query.list();
		for(Employe321 e:list) {
			System.out.println(e.getEid()+"  "+e.getName()+"  "+e.getSalary()+" "+e.getCity());
		}
		s.close();
	}
	public void groupByCity() {
		SessionFactory sf=new Configuration().configure("com/employee/entity/Employe123/hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		String hql="select count(name),city from Employe321 group by city";
		Query query=s.createQuery(hql);
		List<Object[]> list=new ArrayList();
		list=query.list();
		for(Object[] e:list) {
			System.out.println("count of city: "+e[0]+ ",name: "+e[1]);
		}
		s.close();
	}
	
}
