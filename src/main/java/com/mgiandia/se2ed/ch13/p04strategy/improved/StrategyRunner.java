package com.mgiandia.se2ed.ch13.p04strategy.improved;

public class StrategyRunner {

	public static void main(String[] args) {

		SortingStrategy strategy = giveMeStrategy(); 
		Context context = new Context(strategy);
		context.sortSomething();
		
	}

	private static SortingStrategy giveMeStrategy() {
		return new BubbleSort();
//		return new MergeSort();	    
	}
	
}
