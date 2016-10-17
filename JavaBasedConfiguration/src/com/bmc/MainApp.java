package com.bmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

	      helloWorld.setMessage("Hello World!");
	     System.out.println(helloWorld.getMessage());
	   }
	}








/*


public class MessageRunner {

final static Logger logger = LoggerFactory.getLogger(MessageRunner.class);


public static void main(String[] args) {
    logger.info("Initializing Spring context.");
    
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
    
    logger.info("Spring context initialized.");

    Message message = (Message) applicationContext.getBean("message");

    logger.debug("message='" + message.getMessage() + "'");
}

}
            
        */