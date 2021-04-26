package com.mgiandia.se2ed.ch13.p03factories.s03abstractfactory;

class LinuxShapeFactory extends ShapeFactory{

	public Circle makeCricle() {
		return new LinuxCircle();
	}
	
	public Rectangle makeRectangle() {
		return new LinuxRectangle();
	}
	
}
