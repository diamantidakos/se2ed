package com.mgiandia.se2ed.ch12.p05callback;

import java.util.Arrays;


public class StringSortRunner {
	public static void main(String[] args) {
		String[] people = new String[2];
		
		people[0] = "giakoumakis";
		people[1] = "diamantidis";
		
		Arrays.sort(people);
		System.out.println(people[0]);
		System.out.println(people[1]);
	}
}
