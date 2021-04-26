package com.mgiandia.se2ed.ch12.p11liskov;

public class Rectangle {

	private int width;
	private int length;
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	
	public void setLength(int length) {
		this.length = length;
	}
	
	
	public int getLength() {
		return length;
	}
	
	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle();		
		myRectangle.setLength(5);
		myRectangle.setWidth(10);		
		System.out.println("Length = " +  myRectangle.getLength());
		System.out.println("Width = "+ myRectangle.getWidth()); 

	}

}
