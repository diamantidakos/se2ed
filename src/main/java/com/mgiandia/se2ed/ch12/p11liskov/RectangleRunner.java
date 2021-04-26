package com.mgiandia.se2ed.ch12.p11liskov;

public class RectangleRunner {


	public static void main(String[] args) {
		
		Rectangle myRectangle = new Square();
		
		myRectangle.setLength(5);
		myRectangle.setWidth(10);
		
		System.out.println("Length = " +  myRectangle.getLength());
		System.out.println("Width = "+ myRectangle.getWidth()); 
 

	}

	
}
