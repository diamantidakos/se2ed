package com.mgiandia.se2ed.ch12.p03conditionallogic.meteoimproved;

public class StationRunner {
 

	public static void main(String[] args) {
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		
		StationController station = new ConsoleBasedController();
		station.setTemperatureSensor(temperatureSensor);
		station.selfTest();
		station.collectData();
		

	} 

}
