package com.luv2code.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;
//import com.sun.istack.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

	//setup logger
	private Logger myLogger=Logger.getLogger(getClass().getName());
	//setup pointcut declaration 
	//.* any package .* any class .any method (..) any number of args 
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {
		 
		
	}
	
	//do the same for service and dao
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage() {
		 
		
	}
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDAOPackage() {
		 
		
	}
	
	@Pointcut("forControllerPackage()||forServicePackage()||forDAOPackage()")
	private void forAppFlow() {
		 
		
	}
	
	//add the before advice 
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint)
	{
		//myLogger.info(+);
		//display arguments  
		//loop through and display arguments  
		Object [] args=theJoinPoint.getArgs();
		for(Object tempArgs:args) {
			myLogger.info("inside here "+tempArgs);
		}
	}
	//add the after returning advice 
	@AfterReturning(
			pointcut="forAppFlow()",
			returning="theResult"
			)
	public void afterReturning(JoinPoint theJoinPoint,Object theResult)
	{
		
		myLogger.info(""+theResult);
	}
}
