package com.mgiandia.se2ed.ch13.p01adapter.meteoimproved;

public class StationRunner {


	public static void main(String[] args) {

		StationController station = new StationController(new ConsoleLog());
		MgNdTemperatureSensor sensor = new MgNdTemperatureSensor();
		StrangeTemperatureSensor strange = new StrangeTemperatureSensor();
		StrangeTemperatureSensorAdapter adapter = new StrangeTemperatureSensorAdapter(strange);
		station.addSensor(sensor);
		station.addSensor(adapter);
		station.collectData();
	} 

}
