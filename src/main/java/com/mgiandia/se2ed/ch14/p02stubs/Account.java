package com.mgiandia.se2ed.ch14.p02stubs;

import java.util.ArrayList;
import java.util.List;

public class Account {
	List<Transaction> transactions = new ArrayList<Transaction> ();  
	
	public Transaction deposit(int amount) {
		Transaction deposit = Transaction.newDeposit(amount);
		transactions.add(deposit);
		return deposit;
	}
	
	public Transaction withdraw(int amount) {
		
		if (amount > getBalance() ) {
			throw new BankException();
		}
		
		Transaction withdrawal = Transaction.newWithdrawal(amount);
		transactions.add(withdrawal);
		return withdrawal;
	}
	
	public int getBalance() {
		int balance = 0;
		for(Transaction transaction : transactions) {
			balance += transaction.getAmount();
		}
		return balance;
	}
	
	public int getBalanceInDollars(CurrencyConverter converter) {
		return converter.eurosToDollars(getBalance());
	}
}
