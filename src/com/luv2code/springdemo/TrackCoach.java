package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it :" + fortuneService.getFortune();
	}
	
	// init method
	public void startUp() {
		System.out.println("TrackCoach: startUp()");
	}
	
	// destroy method
	public void cleanUp() {
		System.out.println("TrackCoach: cleanUp()");
	}
}
