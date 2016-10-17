// Dependency on Object
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
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
Sequence of output

Jan 11, 2013 6:10:52 AM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@1c7e2da: startup date [Fri Jan 11 06:10:52 IST 2013]; root of context hierarchy
Jan 11, 2013 6:10:52 AM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring.xml]
My bean factory post processor is called
Jan 11, 2013 6:10:52 AM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@16509fe: defining beans [triangle,zeroPoint,point2,point3,MyBeanFactoryPP#0]; root of factory hierarchy
Point A = 0 Point A = 0
Point B = -20 Point A = 0
Point C = 20 Point A = 0


Beanfactorypostprocessor is called first
then bean factory initialization



Second output

Jan 11, 2013 6:33:03 AM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@11db6bb: startup date [Fri Jan 11 06:33:03 IST 2013]; root of context hierarchy
Jan 11, 2013 6:33:03 AM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring.xml]
Jan 11, 2013 6:33:04 AM org.springframework.core.io.support.PropertiesLoaderSupport loadProperties
INFO: Loading properties file from class path resource [PointsConfig.properties]
My bean factory post processor is called
Jan 11, 2013 6:33:04 AM org.springframework.beans.factory.support.DefaultListableBeanFactory preInstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@16509fe: defining beans [triangle,zeroPoint,point2,point3,MyBeanFactoryPP#0,org.springframework.beans.factory.config.PropertyPlaceholderConfigurer#0]; root of factory hierarchy
Point A = 0 Point A = 0
Point B = -20 Point A = 0
Point C = 20 Point A = 0
 
 
 you can see PropertiesLoaderSupport
 
 

*/