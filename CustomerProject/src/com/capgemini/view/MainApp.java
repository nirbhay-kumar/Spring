package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.repository.CustomerRepository;
import com.capgemini.service.CustomerService;

public class MainApp {

	public static void main(String[] args) {
	
		
		/*CustomerService customerService=new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName());*/
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService customerService = (CustomerService)applicationContext.getBean("customerService");
		
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
