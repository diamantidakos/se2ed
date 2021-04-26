package com.mgiandia.se2ed.ch13.p07composite.s01shapes;

import java.util.*;


public class CompositeShape implements Shape {
	List<Shape> shapes = new ArrayList<Shape>();
	
	public boolean addShape(Shape shape) {
		return shapes.add(shape);
	}
	
	public boolean removeShape(Shape shape) {
		return shapes.remove(shape);
	}

	public void move() {
		for(Shape shape : shapes ) {
			shape.move();
		}	
	}

	public void draw() {
		for(Shape shape : shapes ) {
			shape.draw();
		}	
	}
	

}
