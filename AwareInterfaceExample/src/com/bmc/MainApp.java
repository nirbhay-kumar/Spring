package com.bmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("SPRING.XML");//LINE 1
		//WITH LINE 1 O/P
	/*from String parameterized constructor
		Bean name is employee
		From setApplicationContext
		*/
		
		
		// with line 1 and line 2 and 3 from employee o/p is
		/*from String parameterized constructor
		Bean name is employee
		From setApplicationContext 
		Employee [name=Sanjay]*/
		
		
		/*one case Triangle -singleton
		 * all Point as an prototype?
		 */
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SPRING.XML");//LINE 1
		context.registerShutdownHook();
		context.close();
	}

}
