package com.mgiandia.se2ed.ch11.p07composition.var2;


/**
 * Ο δανειζόμενος.
 * @author Νίκος Διαμαντίδης
 *
 */


public class Borrower  {
    private Address address;


    public void setAddress(Address address) {
        this.address = address == null ? null : new Address(address);
    }


    public Address getAddress() {
        return address == null ? null : new Address(address);
    }

}
