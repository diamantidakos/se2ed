package com.mgiandia.se2ed.ch12.p10delegation.meteobefore;

public abstract class HumiditySensor implements Sensor {

	public float read() {
		return readHumidity();
	}

	protected abstract float readHumidity();

}