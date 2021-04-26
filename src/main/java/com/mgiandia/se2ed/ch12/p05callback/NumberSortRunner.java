package com.mgiandia.se2ed.ch12.p05callback;

import java.util.Arrays;


public class NumberSortRunner {
	public static void main(String[] args) {
		int[] numbers = new int[2];
		
		numbers[0] = 3;
		numbers[1] = 2;
		
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
	}
}
