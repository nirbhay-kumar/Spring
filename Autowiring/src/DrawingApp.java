// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
	}

}

/*
Triangle triangle=new Triangle();
triangle.draw

by simply writing 2 lines also we can achieve the result, when object becomes complex with more properties above approach is better
*/

