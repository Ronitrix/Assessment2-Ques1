package com.beanconfig;

public class Employee {
	private int Eid;
	private String Ename;
	private String Dept;
	private Address address;
	
	/*
	 * We have created a parameterized constructor which will take the values from
	 * beans.xml where id=employee
	 */
	
	public Employee(int Eid, String Ename, String Dept, Address address) {
		super();
		this.Eid = Eid;
		this.Ename = Ename;
		this.Dept = Dept;
		this.address = address;
	}
	public int getId() {	
		return Eid;
	}	
	public String getName() {
		return Ename;
	}
	public String getBranch() {
		return Dept;
	}
	public Employee() {
		super();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}

