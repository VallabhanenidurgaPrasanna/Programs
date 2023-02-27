package com.Bitlabs.entity.SpringcoreDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      Employes emp=(Employes) context.getBean("emp");
      System.out.println(emp);
      Employes employee1=(Employes) context.getBean("emp1");
      System.out.println(employee1);
      Employes employee2=(Employes) context.getBean("emp2");
      System.out.println(employee2);
    }
}
