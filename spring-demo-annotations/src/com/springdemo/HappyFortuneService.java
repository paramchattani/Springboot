package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
	return "self motivation is the key";
	
	}

}
