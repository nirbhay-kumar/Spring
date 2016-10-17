package org.crescent;

import org.crescent.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		
            
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);// If u pass second parameter, no need to cast
		//System.out.println(shapeService.getCircle().getName());
		// try with triangle
		
		System.out.println(shapeService.getTriangle().getName());
		
		//System.out.println(shapeService.getCircle().getName());
	}

}
