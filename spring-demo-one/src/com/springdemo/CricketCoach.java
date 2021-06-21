package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	//add fields for email and team ;
	private String emailAddress;
	private String team;
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("email");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("team");
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public CricketCoach()
	{
		System.out.println("inside cricket coach ");
	}
	@Override
	public String getDailyWorkout() {
		return "Do five reps per minute";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside fortune setter");
		this.fortuneService = fortuneService;
	}
	

}
