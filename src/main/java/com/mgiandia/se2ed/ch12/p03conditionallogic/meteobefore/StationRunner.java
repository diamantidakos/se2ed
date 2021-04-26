package com.mgiandia.se2ed.ch12.p03conditionallogic.meteobefore;

public class StationRunner {


	public static void main(String[] args) {
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		
		StationController station = new StationController(false);
		station.setTemperatureSensor(temperatureSensor);
		station.collectData();
		station.selfTest();
		
		

	} 

}
