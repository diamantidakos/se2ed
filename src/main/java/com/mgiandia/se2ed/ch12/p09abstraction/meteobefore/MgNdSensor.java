package com.mgiandia.se2ed.ch12.p09abstraction.meteobefore;

public class MgNdSensor implements TemperatureSensor {
	@Override
	public float readTemperature() {
		return 5f;
	}
}
