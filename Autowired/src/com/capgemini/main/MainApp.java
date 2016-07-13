package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = (Employee)applicationContext.getBean("employee");
		
		System.out.println(employee.getAddress().getCity());

	}

}
