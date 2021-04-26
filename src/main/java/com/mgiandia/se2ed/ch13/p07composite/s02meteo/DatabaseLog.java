package com.mgiandia.se2ed.ch13.p07composite.s02meteo;

public class DatabaseLog implements Log {

	@Override
	public void write(String message) {
		System.out.println("Writing to database " + message);
	}
}
