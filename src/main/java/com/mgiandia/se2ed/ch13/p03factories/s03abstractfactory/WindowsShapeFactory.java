package com.mgiandia.se2ed.ch13.p03factories.s03abstractfactory;

class WindowsShapeFactory extends ShapeFactory{

	
	public Circle makeCricle() {
		return new WindowsCircle();
	}

	public Rectangle makeRectangle() {
		return new WindowsRectangle();
	}


}
