package org.crescent.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.crescent.model.Circle;

@Aspect
public class LoggingAspect {
	//@Before("execution(public String getName())")
	//@Before("execution(public String org.crescent.model.Circle.getName())")
//	@Before("execution(public * get*())")
	
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint)
	{
		//System.out.println("Advice run. Get method called");//Get method called ------message-----for getter and setter
		System.out.println(joinPoint.toString());
		Circle circle=(Circle)joinPoint.getTarget();//real usage getter target object
	}
	
	
	
	
	@Pointcut("execution(* getName())")
	public void allGetters(){}//This is simply dummy method=>pointcuts
	
	
	@Pointcut("within(org.crescent.model.Circle)") // applicable to all methods of Circle class //more readable
	public void allCircleMethods(){}
	
	//1
	/*@Before("args(String)")
	public void stringArgumentMethods()
	{
		System.out.println("A method that takes String arguments has been called");
	}*/
	
	//2
	@Before("args(name)")
	public void stringArgumentMethods(String name)
	{
		System.out.println("A method that takes String arguments has been called");
		System.out.println(name +"inside "); //can be used for some preprocessing
		
	}
	
}

