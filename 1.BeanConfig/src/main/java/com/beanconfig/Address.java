package com.beanconfig;

public class Address {
	private int flatno;
	private String road;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * We have created a parameterized constructor which will take the values from
	 * beans.xml where id=address
	 */
	
	  public Address(int flatno, String road, String city) { 
		  super();
		  this.flatno =flatno;
		  this.road = road;
		  this.city = city; 
		  }
	public int getFlatno() {
		return flatno;
	}
	public String getRoad() {
		return road;
	}
	public String getCity() {
		return city;
	}
	public String toString(){   //overriding the toString() method
		
	    return "Address: [Flat No.: "+flatno+"   Road: "+road+"   City: "+city+"]" ;
	    
	     }
	}
