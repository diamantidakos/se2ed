package com.mgiandia.se2ed.ch11.p07composition.var1;


/**
 * Ο δανειζόμενος.
 * @author Νίκος Διαμαντίδης
 *
 */


public class Borrower  {
    private Address address = new Address();

	public void setStreet(String street) {
		address.setStreet(street);
	}

	public String getStreet() {
		return address.getStreet();
	}

	public void setNumber(String number) {
		address.setNumber(number);
	}

	public String getNumber() {
		return address.getNumber();
	}

	public void setCity(String city) {
		address.setCity(city);
	}

	public String getCity() {
		return address.getCity();
	}

	public void setZipCode(ZipCode zipcode) {
		address.setZipCode(zipcode);
	}

	public ZipCode getZipCode() {
		return address.getZipCode();
	}

	public void setCountry(String country) {
		address.setCountry(country);
	}

	public String getCountry() {
		return address.getCountry();
	}



}
