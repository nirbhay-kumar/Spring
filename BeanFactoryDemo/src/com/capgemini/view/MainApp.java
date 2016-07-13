package com.capgemini.view;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.core.io.ClassPathResource;

import com.capgemini.model.Employee;

class MainApp {

	public static void main(String[] args) {
		/*ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("After application context ");
		Employee employee = (Employee)applicationContext.getBean("employee");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
*/
		
		
		//First approach : xml file should be project root
				/*Resource resource = new FileSystemResource("applicationContext.xml");
				BeanFactory factory = new XmlBeanFactory(resource);*/
				
				          //    OR
				//xml file should be in classpath
				ClassPathResource resource = new ClassPathResource("applicationContext.xml");
				BeanFactory factory = new XmlBeanFactory(resource);
				
				System.out.println("Is Employee obj created ? ");
				
				System.out.println("Getting employee constructor message after this");
				
				Employee employee = (Employee)factory.getBean("employee");
				
				System.out.println(employee.getEmployeeId());
				System.out.println(employee.getName());
				
	}

}
