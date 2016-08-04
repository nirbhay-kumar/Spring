package com.capgemini;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
	
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
	@Override
	public void destroy() throws Exception {
		System.out.println("From destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after propertiesset");
		
	}
	
	
	

}
