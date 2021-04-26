package com.mgiandia.se2ed.ch12.p06interfacedependencies.meteoimproved;

public class MgNdSensor implements TemperatureSensor {
	@Override
	public float readTemperature() {
		return 5f;
	}
}
