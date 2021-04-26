package com.mgiandia.se2ed.ch14.p03refactoring.s04step4;

public class Employee {
	Person person = new Person(); 
	
	public void  paySalary() {}
	
	public String getFirstName() {
		return person.getFirstName();
	}
	
	public void setFirstName(String firstName) {
		person.setFirstName(firstName); 
	}

	public void setLastName(String lastName) {
		person.setLastName(lastName);
	}

	public String getLastName() {
		return person.getLastName();
	}
	
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
