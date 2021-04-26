package com.mgiandia.se2ed.ch12.p10delegation.meteobefore;

public class StationRunner {


	public static void main(String[] args) {
		StationController station = new FileBasedController();
		station.addSensor(new MgNdTemperatureSensor());
//		station.addSensor(new MgNdHumiditySensor());
		station.selfTest();
		station.collectData();
 
	} 

}
