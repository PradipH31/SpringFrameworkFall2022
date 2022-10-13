package com.hamal.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// create a no-arg constructor
	public CricketCoach() {

	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
