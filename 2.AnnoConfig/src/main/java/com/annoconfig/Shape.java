package com.annoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * The purpose of @Component annotation is to create all the beans of the
 * specified in the beans.xml file. With the help of this annotation we don't
 * need to create bean id of all the classes present the package, as this
 * automatically create the bean id.
 */

@Component

public class Shape {
	
	public String getData() {
		return "Here are the Property of your Shape:";
	}
	
	
	/*
	 * The purpose of @Autowired annotation is to autowire bean on properties,
	 * setter methods or constructors. With the help of this we can remove the
	 * use of ref to get values from one bean to other bean. So here we don't
	 * need to use ref in beans.xml to get values of Property class beans in
	 * shape class.
	 */
	
	@Autowired
	
	/*
	 * The purpose of @Qualifier annotation is to specify which particular bean
	 * you want to get wired in case of multiple beans of same class. So here
	 * i have mentioned property2 so that i can see the values of property2.
	 */
	
	@Qualifier("property2")
	
	private Properties property;
	public Properties getProperty() {
		return property;
	}
	/* 
	 * Since we are using @Autowired annotation on properties so we don't 
	 * require setter methods because Spring will automatically assign those
	 * properties with the passed values or references.
	 */
	
	
	/*
	 * public void setProperty(Properties property) { this.property = property; }
	 */
}
