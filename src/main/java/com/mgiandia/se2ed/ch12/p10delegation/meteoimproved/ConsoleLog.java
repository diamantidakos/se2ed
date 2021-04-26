package com.mgiandia.se2ed.ch12.p10delegation.meteoimproved;

public class ConsoleLog implements Log {
	
	 
	public void write(String message) {
		System.out.println("Writing to Console " + message);
	}
}
