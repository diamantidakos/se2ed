package com.mgiandia.se2ed.ch14.p01banking;

import java.util.ArrayList;
import java.util.List;



public class Account {
	List<Transaction> transactions = new ArrayList<Transaction> ();  
	
	public Transaction deposit(int amount) {
		Transaction newDeposit = Transaction.newDeposit(amount);
		transactions.add(newDeposit);
		return newDeposit;
	}
	
	public Transaction withdraw(int amount) {
		
		if (amount > getBalance() ) {
			throw new BankException();
		}

		Transaction newWithdrawal = Transaction.newWithdrawal(amount);
		transactions.add(newWithdrawal);
		return newWithdrawal;
	}
	
	
	public int getBalance() {
		int balance = 0;
		for(Transaction transaction : transactions) {
			balance += transaction.getAmount();
		}
		return balance;
	}
}
