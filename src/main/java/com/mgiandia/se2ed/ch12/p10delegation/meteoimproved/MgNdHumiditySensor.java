package com.mgiandia.se2ed.ch12.p10delegation.meteoimproved;

public class MgNdHumiditySensor extends HumiditySensor {

	@Override
	protected float readHumidity() {
		return 10f;
	}

}
