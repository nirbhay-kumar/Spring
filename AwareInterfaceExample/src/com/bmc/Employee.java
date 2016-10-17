package com.bmc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware,BeanNameAware{
	
	private String name;

	public Employee(String name) {
		super();
		System.out.println("from String parameterized constructor");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is "+beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		
		System.out.println("From setApplicationContext "); //Referring to the same context, doesn't create new one
		
		Employee emp = (Employee)context.getBean("employee");//Employee line 2
		System.out.println(emp);//Employee line 3
	}
	
	
	
	

}
