package com.mgiandia.se2ed.ch14.p01banking;

import org.junit.jupiter.api.Test;

import com.mgiandia.se2ed.ch14.p01banking.Account;

import org.junit.jupiter.api.Assertions;
public class AccountTest {	
	@Test
	public void balanceforNewAccount() {
		Account account = new Account();
		Assertions.assertEquals(0, account.getBalance());
	}

	@Test
	public void oneDeposit() {
		Account account = new Account();
		account.deposit(5);
		Assertions.assertEquals(5, account.getBalance());
	}

	@Test 
	public void manyDeposits() {
		Account account = new Account();
		account.deposit(5);
		account.deposit(15);
		Assertions.assertEquals(20, account.getBalance());
	}

	@Test
	public void depositsAndWithdrawals(){
		Account account = new Account();
		account.deposit(10);
		account.deposit(15);
		account.withdraw(7);
		Assertions.assertEquals(18, account.getBalance());
	}
}
