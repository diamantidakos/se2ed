package com.mgiandia.se2ed.ch13.p06observer.before;



public class Installer {
	
	private static int TOTAL_FILES = 10;
	
	private String fileName;
	private int fileIndex;
	private TextBox fileTextBox = new TextBox();
	private ProgressBar fileProgressBar = new ProgressBar();
	

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
			fileTextBox.print(fileName);
			fileProgressBar.refresh(fileIndex, TOTAL_FILES);
			copyFile();
		}
	}
	
	
	private void copyFile() {
		
	}


}
