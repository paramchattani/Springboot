package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fs;
	public TennisCoach()
	{
		
	}
//	@Autowired
	//public void setFortuneService(FortuneService fas)
	//{
		//fs=fas;
	//}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practise harder";
	}

	@Override
	public String getDailyFortune() {
		return fs.getDailyFortune();
	}
	
	void costructingBean()
	{
		System.out.println("inside post construct");
	}

}
//when spring scans for this class they will get component annotation and will register a bean against it 