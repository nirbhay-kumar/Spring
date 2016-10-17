// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		Triangle triangle=(Triangle)context.getBean("triangle1");
		triangle.draw();
		
		//o/p 
		//Point = 0 Point  = 0
		//Point = -20 Point  = 0
		
		
		
		//if you remove merge="true" op is Point -20 Point 0

	}

}


