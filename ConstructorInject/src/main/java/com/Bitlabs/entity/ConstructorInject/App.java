package com.Bitlabs.entity.ConstructorInject;

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
        Student student=(Student) context.getBean("student");
        System.out.println(student);
        Ambiguity am=(Ambiguity) context.getBean("ambiguity");
        System.out.println(am);
        am.show();
    }
}
