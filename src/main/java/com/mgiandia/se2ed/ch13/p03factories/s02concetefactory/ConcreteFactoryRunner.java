package com.mgiandia.se2ed.ch13.p03factories.s02concetefactory;

public class ConcreteFactoryRunner {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory("Linux");		
		Rectangle rectangle = factory.makeRectangle();
		rectangle.move();
		
//		ShapeFactory factory2 = new ShapeFactory("Win");
//		Rectangle rectangle2 = factory2.makeRectangle();
//		rectangle2.move();
	}

}
