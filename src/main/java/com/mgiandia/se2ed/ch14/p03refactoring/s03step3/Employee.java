package com.mgiandia.se2ed.ch14.p03refactoring.s03step3;

public class Employee extends Person {
	Person person = this; 
	
	public void  paySalary() {}
	
	
	public String toString() {
		String fullName = "";
		if (person.getFirstName() != null ) {
			fullName += person.getFirstName();
		}
		
		if (person.getLastName() != null ) {
			if (fullName.length() > 0 ) {
				fullName += " ";
			}
			fullName += person.getLastName();	
		}
		return fullName;
	}
}
