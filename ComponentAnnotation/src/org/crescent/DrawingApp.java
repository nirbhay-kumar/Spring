package org.crescent;
// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		context.registerShutdownHook();//to execute destroy method of Circle class
		Shape shape=(Shape)context.getBean("circle");//takes by default circle with c small letter
		shape.draw();
	}

}


