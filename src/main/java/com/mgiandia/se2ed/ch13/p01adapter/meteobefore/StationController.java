package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

import java.util.ArrayList;
import java.util.List;

public class StationController {
	private List<Sensor> sensors = new ArrayList<Sensor>();
	private Log log;
	
	public StationController(Log log) {
		this.log = log;
	}

	public void setLog(Log log) {
		this.log = log;
	}
	
	public void selfTest() {
		String status = selfTestStatus();
		log.write(status);
	}
	 
	
	public void collectData() {
		for(Sensor sensor : sensors ) {
			String measurement = String.valueOf(sensor.read());
			log.write(measurement);
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
	

	 
}
