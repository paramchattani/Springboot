package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
String []s= {"all the best ","keep it up ","way to go ","consistency is winning"};
Random r=new Random();
	@Override
	public String getDailyFortune() {
		int index=r.nextInt(s.length);
		return s[index];
	}

}
