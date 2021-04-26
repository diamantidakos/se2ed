package com.mgiandia.se2ed.ch12.p10delegation.meteobefore;

public abstract class TemperatureSensor implements Sensor {

	public float read() {
		return readTemperature();
	}
	
	protected abstract float readTemperature();
}
