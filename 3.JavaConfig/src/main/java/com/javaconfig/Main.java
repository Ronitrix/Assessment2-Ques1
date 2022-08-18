package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * We are using ApplicationContext, it is used to load bean definitions, wire
		 * beans together, and dispense beans upon request We can also use BeanFactory
		 * but its weaker than ApplicationContext
		 */
		
	ApplicationContext context=new AnnotationConfigApplicationContext(Vehicle.class); 
	ApplicationContext context1=new AnnotationConfigApplicationContext(Ferrari.class);
	Vehicle vehicle1=context.getBean("vehicle",Vehicle.class);
	Ferrari vehicle2=context1.getBean("ferrari",Ferrari.class);
	vehicle1.getData();
	vehicle2.getDetails();
	}

}
