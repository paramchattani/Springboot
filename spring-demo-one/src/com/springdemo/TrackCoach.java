package com.springdemo;

public class TrackCoach implements Coach {
private FortuneService fortuneService;
public TrackCoach(FortuneService thefortuneService)
{
fortuneService=thefortuneService;	
}
@Override
	public String getDailyWorkout() {
		return "Spend 30 min running";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
public void doMyStuff()
{
System.out.println("in init method");	
}
public void doMyDestructionStuff()
{
System.out.println("in destroy method");	
}
}
