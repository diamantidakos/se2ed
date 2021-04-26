package com.mgiandia.se2ed.ch13.p01adapter.meteoimproved;

public abstract class TemperatureSensor implements Sensor {


	public float read() {
		return readTemperature();
	}
	
	protected abstract float readTemperature();
}
