package com.mgiandia.se2ed.ch13.p05templatemethod.s01shapes;

public class TemplateMethodRunner {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.move();
		Shape rectangle = new Rectangle();
		rectangle.move();
	}

}
