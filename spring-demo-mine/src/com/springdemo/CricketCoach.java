package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService f;
	public CricketCoach(FortuneService f)
	{
		this.f=f;
	}
	@Override
	public String getMotivation() {
		
		return f.giveAdvice();
	}

}
