package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	// setter method to be called by Spring to inject the dependency
		public void setFortuneService(FortuneService fortuneService) {
			System.out.println("inside Setter method");
			this.fortuneService = fortuneService;
		}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("inside Setter method of emailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("inside Setter method of team");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		super();
		System.out.println("inside CricketCoach no arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
