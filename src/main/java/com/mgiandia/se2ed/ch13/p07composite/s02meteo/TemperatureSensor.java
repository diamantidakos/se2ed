package com.mgiandia.se2ed.ch13.p07composite.s02meteo;

public abstract class TemperatureSensor implements Sensor {


	public float read() {
		return readTemperature();
	}
	
	protected abstract float readTemperature();
}
