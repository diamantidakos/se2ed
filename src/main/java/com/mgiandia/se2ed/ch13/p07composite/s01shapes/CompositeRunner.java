package com.mgiandia.se2ed.ch13.p07composite.s01shapes;

public class CompositeRunner {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Shape circle  = new Circle(); 
		CompositeShape group1 = new CompositeShape();
		addToGroup(group1, rectangle);
		addToGroup(group1, circle);
		group1.move();
		Shape triangle = new Triangle();
		CompositeShape group2 = new CompositeShape();
		addToGroup(group2, group1);
		addToGroup(group2, triangle);
		group2.move();
		
		
	}
	
	private static void addToGroup(CompositeShape group, Shape shape) {
		group.addShape(shape);
	}
	
}
