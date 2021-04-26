package com.mgiandia.se2ed.ch12.p09abstraction.meteobefore;

public class ConsoleBasedController extends StationController{
	
	@Override
	public void write(String message) {
		System.out.println("Writing to Console " + message);
	}
}
