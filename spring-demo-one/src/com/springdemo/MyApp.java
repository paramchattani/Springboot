package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coach coach=new TrackCoach();//this is still hardcoded it is not cofigurable hence spring was designed to address this problem

System.out.println(coach.getDailyWorkout());
	}

}
