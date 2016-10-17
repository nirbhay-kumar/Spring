// Dependency on Object

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		/*BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));// spring.xml file should be root folder
		//Triangle triangle=new Triangle();
		
		Triangle triangle=(Triangle)factory.getBean("triangle");
		triangle.draw();*/
		
		//2 Triangle Drawn
		// with applicationcontext some more advantages are there : event notification , AOP....
		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();*/
		
		
		//3 Equilateral Triangle Drawn
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		//Triangle triangle=(Triangle)context.getBean("triangle");
		Triangle triangle=(Triangle)context.getBean("mytriangle");//using with alias
		triangle.draw();

	}

}


/*
Triangle triangle=new Triangle();
triangle.draw

by simply writing 2 lines also we can achieve the result, when object becomes complex with more properties above approach is better
*/