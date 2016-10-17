// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		context.registerShutdownHook();//to execute destroy method of Circle class not for init method
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
	}

}


