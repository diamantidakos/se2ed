package com.mgiandia.se2ed.ch13.p01adapter.meteoimproved;

public class MgNdTemperatureSensor extends TemperatureSensor {
	@Override
	protected float readTemperature() {
		return 5f;
	}

}
