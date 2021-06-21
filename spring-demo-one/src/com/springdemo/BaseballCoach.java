package com.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	//define constructor 
	public BaseballCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
@Override
public String getDailyWorkout()
{
return "Spend 30 min skipping";	
}

@Override
public String getDailyFortune() {
	return fortuneService.getFortune();
}
}
