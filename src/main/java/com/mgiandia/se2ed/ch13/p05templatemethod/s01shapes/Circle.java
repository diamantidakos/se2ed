package com.mgiandia.se2ed.ch13.p05templatemethod.s01shapes;

public class Circle extends AbstractShape {


	protected void clear() {
		System.out.println("Clearing Circle  ... ");
		
	}

	protected void setNewPosition() {
		System.out.println("Positioning Circle ... ");
	}

	public void draw() {
		System.out.println("Drawing Circle ... ");
	}

}
