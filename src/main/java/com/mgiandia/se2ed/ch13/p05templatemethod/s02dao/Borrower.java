package com.mgiandia.se2ed.ch13.p05templatemethod.s02dao;

public class Borrower implements Comparable<Borrower>{
	private String lastName;
	private String firstName;
	
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFullName() {
		String fullName = "";
		fullName = lastName == null ? fullName : fullName + lastName;
		fullName = firstName == null ? fullName : fullName + " "+ firstName;
		return fullName;
	}

	public int compareTo(Borrower other) {
		return getFullName().compareTo(other.getFullName());
	}
	
}
