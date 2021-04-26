package com.mgiandia.se2ed.ch12.p09abstraction.meteoimproved;

public abstract class TemperatureSensor implements Sensor {

	public float read() {
		return readTemperature();
	}
	
	protected abstract float readTemperature();
}
