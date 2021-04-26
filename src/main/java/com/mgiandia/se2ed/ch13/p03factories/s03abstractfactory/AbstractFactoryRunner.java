package com.mgiandia.se2ed.ch13.p03factories.s03abstractfactory;

public class AbstractFactoryRunner {
	
	public static void main(String[] args) {
		
		System.setProperty("OS", "Windows");
		
		ShapeFactory factory = ShapeFactory.getFactory();
		
		Shape circle = factory.makeCricle();
		Shape rectangle = factory.makeRectangle();
		
		circle.move();
		rectangle.move();
	}
}
