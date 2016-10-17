// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		//1
		/*Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();*/
        
		//2
		Circle circle=(Circle)context.getBean("circle");
		circle.draw();
		
		//3
		/*Shape shape=(Shape)context.getBean("circle");
		shape.draw();*/
	}

}


/*

getting exception much before code execution
At the time of application initialization
Caused by: org.springframework.beans.factory.BeanInitializationException: Property 'center' is required for bean 'circle'

*/