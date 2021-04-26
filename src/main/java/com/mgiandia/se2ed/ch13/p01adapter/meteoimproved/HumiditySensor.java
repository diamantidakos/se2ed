package com.mgiandia.se2ed.ch13.p01adapter.meteoimproved;

public abstract class HumiditySensor implements Sensor {

	public float read() {
		return readHumidity();
	}

	protected abstract float readHumidity();

}