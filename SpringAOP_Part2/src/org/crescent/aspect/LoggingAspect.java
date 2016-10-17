package org.crescent.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//@Before("execution(public String getName())")
	//@Before("execution(public String org.crescent.model.Circle.getName())")
//	@Before("execution(public * get*())")
	
	@Before("allGetters()")
	public void loggingAdvice()
	{
		System.out.println("Advice run. Get method called");
	}
	
	
	@Before("allGetters()")
	public void show()
	{
		System.out.println("From show method");
	}
	
	@Pointcut("execution(* getName())")
	public void allGetters(){}//This is simply dummy method=>pointcuts
	
	//@Pointcut("execution(* * mypack.*(..))")manual
	//@Pointcut("within(org.crescent.model..)") applicable to  this package as well as subpackage
	
	@Pointcut("within(org.crescent.model.Circle)") // applicable to all methods of Circle class //more readable
	public void allCircleMethods(){}
	
	
	@Before("allCircleMethods()")
	public void display()
	{
		System.out.println("for all methods");
	}
	//@Pointcut("execution("* org.crescent.model.Circle.*(..))")
			//

}

/*
@Before("allCircleMethods() && allGetters()")     //one of the best practice 
public void display()
{
	System.out.println("for all methods");
}


args() annotation
*/