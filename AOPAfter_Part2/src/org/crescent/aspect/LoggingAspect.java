package org.crescent.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.crescent.model.Circle;

@Aspect
public class LoggingAspect {
	
	
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint)
	{
		
	}
	
	
	@Pointcut("execution(* getName())")
	public void allGetters(){}//This is simply dummy method=>pointcuts
	
	
	@Pointcut("within(org.crescent.model.Circle)") 
	public void allCircleMethods(){}
	
		
	/*
	//@After("args(name)")
	@AfterReturning("args(name)")
	public void stringArgumentMethods(String name)
	{
		System.out.println("A method that takes String arguments has been called "+name); //capturing name ------1
		
		
	}*///2
	
	//3
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void stringArgumentMethods(String name,String returnString)
	{
		System.out.println("A method that takes String arguments has been called "+name); //capturing name ------1
		System.out.println("The output value is "+returnString);//capturing return type
		
		
	}
	//4
	//public void stringArgumentMethods(String name,Object returnString) catches any type of return value
	
	//5
	//@AfterThrowing("args(name)")
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void exceptionAdvice(String name,Exception ex)//capturing exception object
	{
			System.out.println("An exception has been thrown "+ex);//call setName method
	}
  
	
}

