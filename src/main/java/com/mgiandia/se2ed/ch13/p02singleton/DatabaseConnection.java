package com.mgiandia.se2ed.ch13.p02singleton;

public class DatabaseConnection {
	private static DatabaseConnection connection = null;
	
	private DatabaseConnection() {}
	
	public static DatabaseConnection getInstance() {
		if (connection == null ) {
			connection = new DatabaseConnection();
		}
		
		return connection;
	}
	
	public void disconnect() {
		
	}
	
	public void connect() {
		
	}
	
	
	public boolean isConnected() {
		return true;
	}
	
}
