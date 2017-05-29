package com.turreta.mockito.example;

public class SomeManager {
	
	private SomeService1 service1;

	public SomeService1 getService1() {
		return service1;
	}

	public void setService1(SomeService1 service1) {
		this.service1 = service1;
	}
	
	void processSomethingRandom() {
		System.out.println("Start: In SomeManager: " + service1.getSomethingRandom());
		
		// Print again
		System.out.println("End: In SomeManager: " +service1.getSomethingRandom());
	}
}
