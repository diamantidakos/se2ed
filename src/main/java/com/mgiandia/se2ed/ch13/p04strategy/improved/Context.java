package com.mgiandia.se2ed.ch13.p04strategy.improved;

public class Context {
	private SortingStrategy strategy;

	public Context(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	public void sortSomething() {
		strategy.sort(this);
	}
}
