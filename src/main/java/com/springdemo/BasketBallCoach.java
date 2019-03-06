package com.springdemo;

public class BasketBallCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Do the basketball training today";
	}

	@Override
	public String getFortune() {
		return "You will play great basketball today";
	}

}
