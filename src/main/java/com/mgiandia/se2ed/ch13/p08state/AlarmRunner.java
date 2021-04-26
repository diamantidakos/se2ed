package com.mgiandia.se2ed.ch13.p08state;

public class AlarmRunner {

	public static void main(String[] args) {
		
		Alarm alarm = new Alarm();
		alarm.arm();
		alarm.intrusion();
		alarm.deactivate();

	}

}
