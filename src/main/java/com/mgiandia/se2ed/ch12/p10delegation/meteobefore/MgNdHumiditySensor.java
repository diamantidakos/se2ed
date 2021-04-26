package com.mgiandia.se2ed.ch12.p10delegation.meteobefore;

public class MgNdHumiditySensor extends HumiditySensor {

	@Override
	protected float readHumidity() {
		return 11;
	}

}
