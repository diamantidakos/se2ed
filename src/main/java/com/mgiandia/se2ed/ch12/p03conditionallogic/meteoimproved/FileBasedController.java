package com.mgiandia.se2ed.ch12.p03conditionallogic.meteoimproved;

public class FileBasedController extends StationController {

	@Override
	protected void write(String message) {
		System.out.println("Writing to File " + message);
	}

}