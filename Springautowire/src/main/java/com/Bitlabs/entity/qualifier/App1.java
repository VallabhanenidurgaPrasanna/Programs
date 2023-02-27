package com.Bitlabs.entity.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Bitlabs.entity.Springautowire.Address;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Bitlabs/entity/Springautowire/config.xml");
        Employee1 emp=(Employee1) context.getBean("employee1");
        System.out.println(emp);

	}

}
