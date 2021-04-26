package com.mgiandia.se2ed.ch13.p06observer.before;


public class ProgressBar {
	
	public void refresh(int current, int total) {
		String message = "Progress " + current;
		message += " from " + total;
		System.out.println(message);
	}

}
