package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

public class MgNdHumiditySensor extends HumiditySensor {

	@Override
	protected float readHumidity() {
		return 10f;
	}

}
