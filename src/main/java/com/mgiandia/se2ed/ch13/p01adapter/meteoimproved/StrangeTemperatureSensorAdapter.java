package com.mgiandia.se2ed.ch13.p01adapter.meteoimproved;

public class StrangeTemperatureSensorAdapter extends TemperatureSensor {
	
	private StrangeTemperatureSensor adaptee;
	
	public StrangeTemperatureSensorAdapter(StrangeTemperatureSensor adaptee) {
		this.adaptee=adaptee;
	}
	
	@Override
	protected float readTemperature() {
		return adaptee.currentValue();
	}

}
