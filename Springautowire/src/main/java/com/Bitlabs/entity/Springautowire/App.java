package com.Bitlabs.entity.Springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/Bitlabs/entity/Springautowire/config.xml");
        Employee emp=(Employee) context.getBean("employee");
        System.out.println(emp);
    }
}
