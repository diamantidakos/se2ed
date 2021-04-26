package com.mgiandia.se2ed.ch13.p03factories.s03abstractfactory;

public abstract class ShapeFactory {
	
	private static ShapeFactory instance;
	
	
	public abstract Shape makeCricle();
	public abstract Shape makeRectangle();
	
	public static ShapeFactory getFactory() {
		if ( instance == null) {
			if (System.getProperty("OS") == "Linux") {
				instance = new LinuxShapeFactory();
			}
			else {
				instance = new WindowsShapeFactory();
			}
		}
		
		return instance;
	}
}