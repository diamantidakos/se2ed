package com.mgiandia.se2ed.ch12.p10delegation.meteoimproved;

public class FileLog implements Log {

	public void write(String message) {
		System.out.println("Writing to File " + message);
	}

}
