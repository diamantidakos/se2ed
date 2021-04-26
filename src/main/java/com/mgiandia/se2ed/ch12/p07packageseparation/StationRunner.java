package com.mgiandia.se2ed.ch12.p07packageseparation;

import com.mgiandia.se2ed.ch12.p07packageseparation.meteo.ConsoleBasedController;
import com.mgiandia.se2ed.ch12.p07packageseparation.meteo.StationController;
import com.mgiandia.se2ed.ch12.p07packageseparation.mgnd.MgNdSensor;
import com.mgiandia.se2ed.ch12.p07packageseparation.sensor.TemperatureSensor;

public class StationRunner {
 

	public static void main(String[] args) {
		TemperatureSensor temperatureSensor = new MgNdSensor();
		
		StationController station = new ConsoleBasedController();
		station.setTemperatureSensor(temperatureSensor);
		station.selfTest();
		station.collectData();
		

	} 

}
