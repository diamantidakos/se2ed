package com.mgiandia.se2ed.ch12.p10delegation.meteoimproved;

public class StationRunner {
   
	public static void main(String[] args) {
		Log log = new ConsoleLog();
		StationController station = new StationController(log);
		station.addSensor(new MgNdTemperatureSensor());
		station.addSensor(new MgNdHumiditySensor());
		station.selfTest();
		station.collectData();

	} 

}
