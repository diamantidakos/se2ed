package com.mgiandia.se2ed.ch13.p07composite.s02meteo;

import java.util.ArrayList;
import java.util.List;

public class CompositeLog implements Log {
	private List<Log> logs = new ArrayList<Log>();
	
	@Override
	public void write(String message) {
		for(Log log : logs) {
			log.write(message);
		}
	}
	
	public void addLog(Log log) {
		logs.add(log);
	}

	public void removeLog(Log log) {
		logs.remove(log);
	}
}
