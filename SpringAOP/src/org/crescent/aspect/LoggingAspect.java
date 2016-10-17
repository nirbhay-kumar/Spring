package org.crescent.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	//@Before("execution(public String getName())")
	//@Before("execution(public String org.crescent.model.Circle.getName())")
	//@Before("execution(public * get*())")
	//@Before("execution(public * get*(*))")one or more args
	
	//@Before("execution(public String org.crescent.model.*.getName())") wild card applied to package
	//@Before("execution(public String org.crescent.model.Triangle.getName())")
	//@Before("execution(public * get*(*))")//one or more args
	//@Before("execution(public * get*(..))")//zero or more args
	
	
	
	//@Before("execution(public * get*())")
	//@Before("execution(public * get*())")
	//@Before("execution(public String getName())")
	//@Before("execution(public * get*())")
	//@Before("execution(public String getName())")
	//@Before("execution(public * get*())")
	//@Before("execution( String org.crescent.model.Triangle.getName())")
	//@Before("execution(public String getName())")
	
	//@Before("execution( String org.crescent.model.Triangle.getName())")
	@Before("execution(public * get*())")
	public void loggingAdvice()//advice is a standard terminology
	{
		System.out.println("Advice run. Get method called");
	}
	
	/*
	@Before("execution(public * get*())")//in this case get expression is repeated, sol=>pointcuts
	public void secondAdvice()
	{
		System.out.println("second advice");
	}
*/
}
