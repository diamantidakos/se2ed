package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

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
