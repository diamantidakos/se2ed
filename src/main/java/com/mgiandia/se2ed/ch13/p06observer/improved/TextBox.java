package com.mgiandia.se2ed.ch13.p06observer.improved;


public class TextBox implements Observer{
	private Installer installer;
	
	public TextBox(Installer installer) {
		this.installer = installer;
		this.installer.attach(this);
	}
	
	public void print(String message) {
		System.out.println(message);
	}

	public void update(Subject subject) {
		if (subject == installer) {
			print(installer.getFileName());
		}
	}
	
}
