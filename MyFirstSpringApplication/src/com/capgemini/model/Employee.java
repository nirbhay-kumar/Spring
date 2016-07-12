package com.capgemini.model;

public class Employee {

	private int employeeId;
	private String name;
	
	public Employee()
	{
		System.out.println("From constructor");
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
	
	
}
