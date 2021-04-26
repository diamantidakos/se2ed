package com.mgiandia.se2ed.ch12.p05callback;

public class Borrower implements Comparable<Borrower>{
	private String lastName;
	private String firstName;
	
	public Borrower(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
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
