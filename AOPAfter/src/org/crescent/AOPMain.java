package org.crescent;

import org.crescent.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		
            
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);// If u pass second parameter, no need to cast
		shapeService.getCircle().setName("new name");
		//System.out.println(shapeService.getCircle().getName());
		// try with triangle
		
		//System.out.println(shapeService.getTriangle().getName());
	}

}


/*
@After - executing after method whether method executes successfully or not
*/