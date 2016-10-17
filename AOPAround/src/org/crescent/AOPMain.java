package org.crescent;

import org.crescent.model.Circle;
import org.crescent.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		
            
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		Circle circle=ctx.getBean("circle",Circle.class);
		
		
		circle.getName();
		
	}

}


