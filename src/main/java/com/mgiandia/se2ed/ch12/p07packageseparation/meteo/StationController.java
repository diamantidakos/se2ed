package com.mgiandia.se2ed.ch12.p07packageseparation.meteo;

import com.mgiandia.se2ed.ch12.p07packageseparation.sensor.TemperatureSensor;

public abstract class StationController {
	private TemperatureSensor temperatureSensor;
		

	public void setTemperatureSensor(TemperatureSensor temperatureSensor) {
		this.temperatureSensor = temperatureSensor;
	}
	
	public void collectData() {
		String temperature = String.valueOf(temperatureSensor.readTemperature());
		write(temperature);
	}

	public void selfTest() {
		String status = selfTestStatus();
		write(status);
	}
	 
	protected abstract void write(String message);
	
	
	
	private String selfTestStatus() {
		return " ok ";
	}
	

	 
}
