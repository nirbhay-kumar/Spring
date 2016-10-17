package org.crescent;

import org.crescent.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

	public static void main(String[] args) {
		
            
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
		//shapeService.getCircle().setNameandReturn("new name");
		
		shapeService.getCircle().setName("new name");
		
	}

}


