package com.mgiandia.se2ed.ch12.p07packageseparation.meteo;

public class ConsoleBasedController extends StationController{
	
	@Override
	public void write(String message) {
		System.out.println("Writing to Console " + message);
	}
}
