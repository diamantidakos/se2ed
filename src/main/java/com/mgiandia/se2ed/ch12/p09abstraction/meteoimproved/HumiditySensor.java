package com.mgiandia.se2ed.ch12.p09abstraction.meteoimproved;

public abstract class HumiditySensor implements Sensor {

	public float read() {
		return readHumidity();
	}

	protected abstract float readHumidity();

}