package com.mgiandia.se2ed.ch12.p06interfacedependencies.meteoimproved;

public class StationRunner {
 

	public static void main(String[] args) {
		TemperatureSensor temperatureSensor = new MgNdSensor();
		
		StationController station = new ConsoleBasedController();
		station.setTemperatureSensor(temperatureSensor);
		station.selfTest();
		station.collectData();
		

	} 

}
