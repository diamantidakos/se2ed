package com.mgiandia.se2ed.ch12.p03conditionallogic.meteobefore;

public class StationController {
	private boolean useFile;
	private TemperatureSensor temperatureSensor;
		
	public StationController (boolean useFile) {
		this.useFile = useFile;
	}

	public void setTemperatureSensor(TemperatureSensor temperatureSensor) {
		this.temperatureSensor = temperatureSensor;
	}
	
	public void collectData() {
		String temperature = 
			String.valueOf(temperatureSensor.readTemperature());
		if (useFile) {
			writeToFile(temperature);
		} else {
			writeToConsole(temperature);
		} 
	}

	public void selfTest() {	
		String status = selfTestStatus();
		if (useFile) {
			writeToFile(status);
		} else {
			writeToConsole(status);
		} 
	}
	
	private void writeToConsole(String message) {
		System.out.println("Writing to Console " + message);
	}
	public void writeToFile(String message) {
		System.out.println("Writing to File " + message);
	}
	
	private String selfTestStatus() {
		return " ok ";
	}
	 
}
