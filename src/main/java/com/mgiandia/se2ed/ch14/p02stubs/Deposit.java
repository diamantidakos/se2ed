package com.mgiandia.se2ed.ch14.p02stubs;

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
