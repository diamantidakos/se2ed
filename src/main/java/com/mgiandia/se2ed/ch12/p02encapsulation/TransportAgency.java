package com.mgiandia.se2ed.ch12.p02encapsulation;

public class TransportAgency {
	public static Transport findTransport() {
		return new Car();
	}
}
