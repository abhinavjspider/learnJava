package com.in28minutes.microservices.limitsservices.bean;

public class LimitConfiguration {

	private int maximun;
	private int minimum;
	
	protected LimitConfiguration() {
		
	}
	public LimitConfiguration(int maximun, int minimum) {
		super();
		this.maximun = maximun;
		this.minimum = minimum;
	}
	public int getMaximun() {
		return maximun;
	}
	public int getMinimum() {
		return minimum;
	}
}
