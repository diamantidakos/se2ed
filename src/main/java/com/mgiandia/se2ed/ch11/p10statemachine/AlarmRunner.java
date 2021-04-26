package com.mgiandia.se2ed.ch11.p10statemachine;

public class AlarmRunner {

	public static void main(String[] args) {
		
		Alarm alarm = new Alarm();
		alarm.arm();
		alarm.intrusion();
		alarm.deactivate();

	}

}
