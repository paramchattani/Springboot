package com.springdemo;

public class MotivateService implements FortuneService {

	@Override
	public String giveAdvice() {
		return "Work hard" + "work smart";

	}

}
