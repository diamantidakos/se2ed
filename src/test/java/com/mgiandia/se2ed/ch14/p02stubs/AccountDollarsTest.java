package com.mgiandia.se2ed.ch14.p02stubs;


import org.junit.jupiter.api.Test;

import com.mgiandia.se2ed.ch14.p02stubs.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class AccountDollarsTest {
	private Account account;
	private CurrencyConverterStub converter; 
	
	
	@BeforeEach
	public void setUp(){
		account = new Account();
		converter = new CurrencyConverterStub(2);
	}
	
	@Test
	public void testGetBalanceinDollars() {
		account.deposit(5);
		account.withdraw(2);
		int balance = account.getBalanceInDollars(converter);
		Assertions.assertEquals(6, balance);
	}
}
