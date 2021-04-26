package com.mgiandia.se2ed.ch13.p02singleton;

public class SingletonRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton == singleton2) {
			System.out.println("Same instances");
		}
	}

}
