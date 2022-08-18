package com.annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String [] args) {
		
/*
 * We are using ApplicationContext, it is used to load bean definitions, wire
 * beans together, and dispense beans upon request We can also use BeanFactory
 * but its weaker than ApplicationContext
 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

//We are creating bean object of Shape Class and storing the data from the id shape in beans.xml file	
		
		Shape s1=(Shape)context.getBean("shape");

//Here we are printing the details of the Shape
		
		System.out.println(s1.getData());
		System.out.println(s1.getProperty());
	}

}