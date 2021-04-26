package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

public abstract class TemperatureSensor implements Sensor {


	public float read() {
		return readTemperature();
	}
	
	protected abstract float readTemperature();
}
