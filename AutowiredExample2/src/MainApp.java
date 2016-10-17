import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

		Employee emp=context.getBean(Employee.class,"employee");
		
		System.out.println(emp);//autowired by qualifier

	}

}
