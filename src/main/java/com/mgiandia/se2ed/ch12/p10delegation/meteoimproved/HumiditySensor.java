package com.mgiandia.se2ed.ch12.p10delegation.meteoimproved;

public abstract class HumiditySensor implements Sensor {

	public float read() {
		return readHumidity();
	}

	protected abstract float readHumidity();

}