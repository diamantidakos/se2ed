package com.mgiandia.se2ed.ch12.p07packageseparation.mgnd;

import com.mgiandia.se2ed.ch12.p07packageseparation.sensor.TemperatureSensor;

public class MgNdSensor implements TemperatureSensor {
	@Override
	public float readTemperature() {
		return 5f;
	}
}
