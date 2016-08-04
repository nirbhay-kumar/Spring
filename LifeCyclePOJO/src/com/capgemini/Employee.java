package com.capgemini;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee {
	
	private int employeeId;
	private String name;
	
	public Employee()
	{
		System.out.println("from employee constructor");
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void init()
	{
		System.out.println("From init method");
	}
	
	public void destroy()
	{
		System.out.println("From destroy");
	}
	

}
