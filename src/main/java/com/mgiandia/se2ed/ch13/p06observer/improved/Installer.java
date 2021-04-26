package com.mgiandia.se2ed.ch13.p06observer.improved;



public class Installer extends  Subject {
	private static int TOTAL_FILES = 10;
	
	private String fileName;
	private int fileIndex;
	

	public String getFileName() {
		return fileName;
	}

	public int getTotalFiles() {
		return TOTAL_FILES ;
	}
	
	
	public int getCurrentFileIndex() {
		return fileIndex;
	}
	
		
	public void installFiles() {
		for(int i = 1; i<=TOTAL_FILES ; i++) {
			fileName = "File " + i;
			fileIndex = i;
			notifyObservers();
			copyFile();
		}
	}
	
	
	private void copyFile() {
		
	}

}
