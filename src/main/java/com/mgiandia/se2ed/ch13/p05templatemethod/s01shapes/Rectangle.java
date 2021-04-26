package com.mgiandia.se2ed.ch13.p05templatemethod.s01shapes;

public class Rectangle extends AbstractShape {


	protected void clear() {
		System.out.println("Clearing Rectangle  ... ");
	}


	protected void setNewPosition() {
		System.out.println("Positioning Rectangle  ... ");
	}

	public void draw() {
		System.out.println("Drawing Rectangle  ... ");
	}
	
}
