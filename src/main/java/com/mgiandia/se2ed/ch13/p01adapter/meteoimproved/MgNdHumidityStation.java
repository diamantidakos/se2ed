package com.mgiandia.se2ed.ch13.p01adapter.meteoimproved;

public class MgNdHumidityStation extends HumiditySensor {

	@Override
	protected float readHumidity() {
		return 10f;
	}

}
