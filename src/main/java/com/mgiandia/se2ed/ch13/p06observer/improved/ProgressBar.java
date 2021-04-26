package com.mgiandia.se2ed.ch13.p06observer.improved;


public class ProgressBar implements Observer {

	private Installer installer;
	
	public ProgressBar(Installer installer) {
		this.installer = installer;
		this.installer.attach(this);
	}
	
	
	public void refresh(int current, int total) {
		String message = "Progress " + current;
		message += " from " + total;
		System.out.println(message);
	}
	
	public void update(Subject subject) {
	
		if (subject == installer) {
			int index = installer.getCurrentFileIndex();
			int total = installer.getTotalFiles();
			refresh(index, total);
		}
		
	}

}
