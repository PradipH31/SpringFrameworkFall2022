package com.hamal.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// literal injection
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

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
