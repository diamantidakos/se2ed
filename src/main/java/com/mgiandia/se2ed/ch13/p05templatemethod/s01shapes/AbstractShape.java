package com.mgiandia.se2ed.ch13.p05templatemethod.s01shapes;

public abstract class AbstractShape implements Shape {

	public final void move() {
		clear();
		setNewPosition();
		draw();
	}
	
	protected abstract void clear();
	protected abstract void setNewPosition();
	public abstract void draw();
}
