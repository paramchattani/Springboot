package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {
		
	@AfterReturning(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
			returning="result"
			)
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint,List<Account> result) {
		
		convertAccountNamesToUpperCase(result);
		
		System.out.println("in after return"+result);
		
		
	}
	
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		for(Account tempAccount:result) {
			String theUpperName=tempAccount.getName().toUpperCase();
			tempAccount.setName(theUpperName);
		}
		
	}


	@Before("execution(public void addAccount())")//it is pointcut 
	public void beforeAddAccount() {
		System.out.println("Executing befo advice");
	}
}

