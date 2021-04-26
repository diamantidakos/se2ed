package com.mgiandia.se2ed.ch12.p02encapsulation;

public class Client {
	private Transport transport;

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Transport getTransport() {
		return transport;
	}
	public void moveTransport() {
		transport.move();
	}
}
