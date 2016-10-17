package org.crescent.aspect;


import org.aspectj.lang.ProceedingJoinPoint;

//@Aspect
public class LoggingAspect {
	
	
	
	//@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)//parameter must be there with around
	{
		//Object returnValue=null;
		try{
		System.out.println("Before advice");  //can decide to call target method based on precondition 
		//returnValue = proceedingJoinPoint.getTarget(); // target method ,can modify original object
		proceedingJoinPoint.getTarget(); // target method ,can modify original object
		System.out.println("After returning");
		}catch(Throwable e)
		{
			System.out.println("After throwing");
		}
		
		System.out.println("After finally");
		//return returnValue;
	}
	
	/*
	@Pointcut("execution(* get*())")
	public void allGetters(){}//This is simply dummy method=>pointcuts
	*/
	
	
	
}

