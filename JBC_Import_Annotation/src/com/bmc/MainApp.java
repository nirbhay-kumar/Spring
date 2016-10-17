package com.bmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
 
		Customer customer = (Customer) context.getBean("customer");
		customer.printMsg("Hello 1");
 
		Schedular schedular = (Schedular) context.getBean("schedular");
		schedular.printMsg("Hello 2");
	}

}
