package com.mgiandia.se2ed.ch14.p01banking;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AccountTestWithSetUp {

	private Account account;

	@BeforeEach
	public void setUp() {
		account = new Account();
	}
	
	@Test
	public void balanceforNewAccount() {
		Assertions.assertEquals(0, account.getBalance());
	}

	@Test
	public void oneDeposit() {
		account.deposit(5);
		Assertions.assertEquals(5, account.getBalance());
	}

	@Test 
	public void manyDeposits() {
		account.deposit(5);
		account.deposit(15);
		Assertions.assertEquals(20, account.getBalance());
	}

	
	@Test
	public void depositsAndWithdrawals(){
		account.deposit(10);
		account.deposit(15);
		account.withdraw(7);
		Assertions.assertEquals(18, account.getBalance());
	}
	
	
	@Test
	public void withdrawalFromEmpty() {
		Assertions.assertThrows(BankException.class, ()-> {
			account.withdraw(5);	
		});
		
	}
	
	@Test
	public void withdrawalWithSmallAmount() {
		account.deposit(10);
		account.deposit(5);
		Assertions.assertThrows(BankException.class, ()-> {
			account.withdraw(19);
		});	
	}
	
	@Test 
	public void negativeamount() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			account.deposit(-1);
		});
	}
}
