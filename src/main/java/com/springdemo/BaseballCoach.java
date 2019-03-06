/**
 * 
 */
package com.springdemo;

/**
 * @author Vrinda
 *
 */
public class BaseballCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
		//System.out.println(fortuneService.getFortune());
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Work Hard!";
	}

	@Override
	public String getFortune() {
		//use fortuneService
		return fortuneService.getFortune();
	}
}
