package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.capgemini.model.Employee;

class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("After application context ");
		Employee employee = (Employee)applicationContext.getBean("employee");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());

	}

}
