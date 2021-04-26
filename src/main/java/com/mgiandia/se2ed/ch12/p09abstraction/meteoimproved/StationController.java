package com.mgiandia.se2ed.ch12.p09abstraction.meteoimproved;

import java.util.ArrayList;
import java.util.List;

public abstract class StationController {
	private List<Sensor> sensors = new ArrayList<Sensor>();
		

	public void selfTest() {
		write(selfTestStatus());
	}
	 
	
	public void collectData() {
		for(Sensor sensor : sensors ) {
			String measurement = String.valueOf(sensor.read());
			write(measurement);
		}
	}
	
	private String selfTestStatus() {
		return " ok ";
	}

	public void addSensor(Sensor sensor) {
		sensors.add(sensor);
	}
	
	public void removeSensor(Sensor sensor) {
		sensors.remove(sensor);
	}
	
	protected abstract void write(String message);
	 
}
