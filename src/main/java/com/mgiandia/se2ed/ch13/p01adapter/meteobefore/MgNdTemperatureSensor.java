package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

public class MgNdTemperatureSensor extends TemperatureSensor {
	@Override
	protected float readTemperature() {
		return 5f;
	}

}
