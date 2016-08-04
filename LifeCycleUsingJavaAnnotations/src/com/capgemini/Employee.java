package com.capgemini;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " );
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}	

}
