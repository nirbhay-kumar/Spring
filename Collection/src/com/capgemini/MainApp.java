package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println("After application context container");
		  Employee employee = applicationContext.getBean("employee", Employee.class);
		  
		  System.out.println(employee.getEmployeeId());
		  
		  System.out.println(employee.getName());
		  
		  List address = employee.getAddress();
		  
		  System.out.println(address);

		
	
	}

}
