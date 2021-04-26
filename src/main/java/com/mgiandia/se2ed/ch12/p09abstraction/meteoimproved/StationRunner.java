package com.mgiandia.se2ed.ch12.p09abstraction.meteoimproved;

public class StationRunner {


	public static void main(String[] args) {
		StationController station = new FileBasedController();
		station.addSensor(new MgNdTemperatureSensor());
//		station.addSensor(new MgNdHumiditySensor());
		station.selfTest();
		station.collectData();
 
	} 

}
