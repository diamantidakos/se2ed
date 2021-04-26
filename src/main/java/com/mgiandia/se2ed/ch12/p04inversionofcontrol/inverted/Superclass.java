package com.mgiandia.se2ed.ch12.p04inversionofcontrol.inverted;

public abstract class Superclass {
	public abstract void unlock() ;
	
	public void open() {
		unlock();
	}
}
