package com.employee.HybernateDemo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
//        Configuration cfg=new Configuration();
//        cfg.configure("com/employee/HybernateDemo1/hibernate.cfg.xml");
//        SessionFactory sf=cfg.buildSessionFactory();
        
        SessionFactory sf=new Configuration().configure("com/employee/HybernateDemo1/hibernate.cfg.xml").buildSessionFactory();
        
        Student123 obj=new Student123();
        obj.setId(109);
        obj.setName("chanti");
        obj.setEmail("p@gmail.com");
        Address a=new Address();
        
        a.setId(110);
        a.setCity("vij");
        a.setStreet("prasadampadu");
        a.setOpen(true);
        a.setAdd_date(new Date());
        FileInputStream fs=new FileInputStream("src/main/java/com/employee/HybernateDemo1/bubble.png");
        byte[] data=new byte[fs.available()];
        fs.read(data);
        a.setImage(data);
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(obj);
        s.save(a);
        tx.commit();
        s.close();
    }
}
