package com.mgiandia.se2ed.ch13.p07composite.s02meteo;

public abstract class HumiditySensor implements Sensor {

	public float read() {
		return readHumidity();
	}

	protected abstract float readHumidity();

}