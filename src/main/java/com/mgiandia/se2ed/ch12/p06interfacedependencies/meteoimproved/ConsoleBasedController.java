package com.mgiandia.se2ed.ch12.p06interfacedependencies.meteoimproved;

public class ConsoleBasedController extends StationController{
	
	@Override
	public void write(String message) {
		System.out.println("Writing to Console " + message);
	}
}
