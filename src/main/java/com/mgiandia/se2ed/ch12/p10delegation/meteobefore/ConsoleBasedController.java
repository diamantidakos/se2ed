package com.mgiandia.se2ed.ch12.p10delegation.meteobefore;

public class ConsoleBasedController extends StationController{
	
	@Override
	public void write(String message) {
		System.out.println("Writing to Console " + message);
	}
}
