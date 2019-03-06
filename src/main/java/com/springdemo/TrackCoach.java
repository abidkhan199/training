
/**
 * 
 */
package com.springdemo;

/**
 * @author Vrinda
 *
 */
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run baby run!!!";
	}

	@Override
	public String getFortune() {
		return "tracking... "+fortuneService.getFortune();
	}

}
