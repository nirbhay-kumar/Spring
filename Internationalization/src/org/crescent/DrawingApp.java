package org.crescent;
// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
		
		//1
		//String message =context.getMessage("greeting",null,"Default greeting",null);
		
		//System.out.println(message);
	}

}