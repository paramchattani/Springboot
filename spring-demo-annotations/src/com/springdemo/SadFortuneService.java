package com.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "You can't do it";
	}

}
