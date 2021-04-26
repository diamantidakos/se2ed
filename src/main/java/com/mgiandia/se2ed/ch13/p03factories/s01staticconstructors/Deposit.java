package com.mgiandia.se2ed.ch13.p03factories.s01staticconstructors;

import java.time.LocalDate;


class Deposit extends Transaction {

	public Deposit(int amount) {	
		if (amount < 0) {
			throw new IllegalArgumentException();
		}
		
		setAmount(amount);
		setDate(LocalDate.now());
	}

}
