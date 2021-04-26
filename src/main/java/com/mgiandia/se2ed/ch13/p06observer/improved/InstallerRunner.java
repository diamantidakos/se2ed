package com.mgiandia.se2ed.ch13.p06observer.improved;


public class InstallerRunner {
	public static void main(String[] args) {
		Installer installer = new Installer();
		Observer textBox = new TextBox(installer);
		Observer progress = new ProgressBar(installer );
		installer.installFiles();
	}
}
