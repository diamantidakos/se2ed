package com.mgiandia.se2ed.ch13.p01adapter.meteobefore;

public class ConsoleLog implements Log {
	
	 
	public void write(String message) {
		System.out.println("Writing to Console " + message);
	}
}
