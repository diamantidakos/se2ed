package com.mgiandia.se2ed.ch12.p05callback;

import java.util.Arrays;

public class BorrowerSortRunner {

	public static void main(String[] args) {
		Borrower[] borrowers = new Borrower[2];
		
		borrowers[0] = new Borrower("giakoumakis", "manolis");
		borrowers[1] = new Borrower("diamantidis", "nikos");
		
		Arrays.sort(borrowers);
		
		System.out.println(borrowers[0].getFullName());
		System.out.println(borrowers[1].getFullName());
	}

}
