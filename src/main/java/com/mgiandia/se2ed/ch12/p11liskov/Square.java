package com.mgiandia.se2ed.ch12.p11liskov;

public class Square extends Rectangle {

	public void setWidth(int width) {
		super.setWidth(width);
		super.setLength(width);
	}
	
	
	public void setLength(int length) {
		super.setWidth(length);
		super.setLength(length);
	}
	
    public static void main(String[] args) {
		
		Square mySquare= new Square();		
		mySquare.setLength(5);
		mySquare.setWidth(10);		
		System.out.println("Length = " +  mySquare.getLength());
		System.out.println("Width = "+ mySquare.getWidth()); 

	}
	
}
