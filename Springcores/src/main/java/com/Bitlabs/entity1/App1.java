package com.Bitlabs.entity1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String args[]) {
 
	 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 
	 Address ad=(Address) context.getBean("address");
	 System.out.println(ad.getId());
	 System.out.println(ad.getCity());
	 System.out.println(ad.getEmp());
	 
	 
	} 
}
