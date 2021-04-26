package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

public abstract class HumiditySensor implements Sensor {

	public float read() {
		return readHumidity();
	}

	protected abstract float readHumidity();

}