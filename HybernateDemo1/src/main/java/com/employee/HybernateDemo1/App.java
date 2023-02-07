package com.employee.HybernateDemo1;



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
        Configuration cfg=new Configuration();
        cfg.configure("com/employee/HybernateDemo1/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Student123 obj=new Student123();
        obj.setId(102);
        obj.setName("durga");
        obj.setEmail("d@gmail.com");   
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(obj);
        tx.commit();
        s.close();
    }
}
