package com.mgiandia.se2ed.ch11.p06aggregation;

public class Car {
	Engine engine;

	public void drive() throws CarException {
		if (engine == null) {
			throw new CarException();
		}
		// ο κώδικας της οδήγησης
	}

}
