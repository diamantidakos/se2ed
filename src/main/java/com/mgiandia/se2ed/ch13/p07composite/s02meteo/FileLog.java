package com.mgiandia.se2ed.ch13.p07composite.s02meteo;

public class FileLog implements Log {

	public void write(String message) {
		System.out.println("Writing to File " + message);
	}

}
