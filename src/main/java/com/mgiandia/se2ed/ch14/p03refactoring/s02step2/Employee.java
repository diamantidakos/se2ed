package com.mgiandia.se2ed.ch14.p03refactoring.s02step2;

public class Employee extends Person {
	Person person = this; 
	
	public void  paySalary() {}
	
	
	public String toString() {
		String fullName = "";
		if (getFirstName() != null ) {
			fullName += getFirstName();
		}
		
		if (getLastName() != null ) {
			if (fullName.length() > 0 ) {
				fullName += " ";
			}
			fullName += getLastName();	
		}
		return fullName;
	}
}
