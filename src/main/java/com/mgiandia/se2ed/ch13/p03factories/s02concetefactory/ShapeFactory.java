package com.mgiandia.se2ed.ch13.p03factories.s02concetefactory;

public class ShapeFactory {
	private String os;
    
	
	public ShapeFactory(String os) {
	    this.os = os;
	}
	
	public Rectangle makeRectangle() {
	    if ( os == "Linux" ) {
	        return new LinuxRectangle();
	    } 
	    return new WindowsRectangle();	    
	}
	
}
