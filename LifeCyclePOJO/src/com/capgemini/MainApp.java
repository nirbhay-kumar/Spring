package com.capgemini;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.registerShutdownHook();
		
		System.out.println("After application context container");
		  Employee employee = applicationContext.getBean("employee", Employee.class);
		  
		  System.out.println(employee.getEmployeeId());
		  
		  System.out.println(employee.getName());
		  
		 

		
		
	}

}
