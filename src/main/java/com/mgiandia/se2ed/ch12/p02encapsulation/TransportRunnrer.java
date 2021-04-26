package com.mgiandia.se2ed.ch12.p02encapsulation;


public class TransportRunnrer {

	public static void main(String[] args) {
		Transport transport = TransportAgency.findTransport();
		Client client = new Client();
		client.setTransport(transport);
		client.moveTransport();
	}

}
