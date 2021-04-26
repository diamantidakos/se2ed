package com.mgiandia.se2ed.ch13.p07composite.s02meteo;

public class StationRunner {


	public static void main(String[] args) {
		ConsoleLog console = new ConsoleLog();
		FileLog file = new FileLog();
		DatabaseLog db = new DatabaseLog();
		
		CompositeLog composite = new CompositeLog();
		composite.addLog(console);
		composite.addLog(file);
		composite.addLog(db);
		
		StationController station = new StationController(composite);
		station.addSensor(new MgNdTemperatureSensor());
		station.addSensor(new MgNdHumidityStation());
		station.selfTest();
		station.collectData();

	} 

}
