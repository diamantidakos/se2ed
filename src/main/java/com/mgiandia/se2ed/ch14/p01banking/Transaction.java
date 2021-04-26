package com.mgiandia.se2ed.ch14.p01banking;

import java.time.LocalDate;

public abstract class Transaction {
	private LocalDate date;
	private int amount;

	
	public LocalDate getDate() {
		return date;
	}
	
	public int getAmount() {
		return amount;
	}
	
	protected void setDate(LocalDate date) {
		this.date = date;  
	}
	
	protected void setAmount(int amount) {
		this.amount = amount;
	}
	
	public static Transaction newDeposit(int amount){
		return new Deposit(amount);
	}
	
	public static Transaction newWithdrawal(int amount) {
		return new Withdrawal(amount);
	}
}
