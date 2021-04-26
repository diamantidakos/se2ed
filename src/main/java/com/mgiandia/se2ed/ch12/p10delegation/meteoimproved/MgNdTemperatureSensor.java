package com.mgiandia.se2ed.ch12.p10delegation.meteoimproved;

public class MgNdTemperatureSensor extends TemperatureSensor {
	@Override
	protected float readTemperature() {
		return 5f;
	}

}
