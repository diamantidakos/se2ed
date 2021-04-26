package com.mgiandia.se2ed.ch13.p02singleton;

public class DatabaseConnectionRunner {

	public static void main(String[] args) {
		DatabaseConnection myConnection;
		DatabaseConnection mySecondConnection;
		
		myConnection = DatabaseConnection.getInstance();
		mySecondConnection = DatabaseConnection.getInstance();
		
		myConnection.connect();
		myConnection.disconnect();
		
		if (myConnection == mySecondConnection) {
			System.out.println("Same db Connections");
		}
		

	}

}
