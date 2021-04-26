package com.mgiandia.se2ed.ch12.p10delegation.meteobefore;

public class MgNdTemperatureSensor extends TemperatureSensor {
	@Override
	protected float readTemperature() {
		return 5f;
	}

}
