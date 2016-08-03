package com.capgemini;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("After application context container");
		  Employee employee = applicationContext.getBean("employee", Employee.class);
		  Employee employee2 = applicationContext.getBean("employee", Employee.class);
		  
		 /* singleton - only once per spring container
		  * prototype - new bean created with every request or reference
         */
		  
		  
		
	
	}

}
