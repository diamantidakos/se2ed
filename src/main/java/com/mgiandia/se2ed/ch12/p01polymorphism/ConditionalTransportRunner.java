package com.mgiandia.se2ed.ch12.p01polymorphism;

public class ConditionalTransportRunner {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		Transport transport;
		if (x>y) {
			transport = new Transport();
		} else {
			transport = new Airplane();
		}
		transport.move();

	}

}
