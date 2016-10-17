// Dependency on Object
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  //spring.xml file should be in classpath
		
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
	}

}


/*


When you uncomment point2 and point3 - 
Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'circle': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire method: public void Circle.setCenter(Point); nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No unique bean of type [Point] is defined: expected single matching bean but found 3: [zeroPoint, point2, point3]


//2
Assign the same name "center" from circle to spring.xml bean id="center"

*/