package com.mgiandia.se2ed.ch13.p05templatemethod.s02dao;

public class BorrowerDAOMySQL extends BorrowerDAOTemplate {

	@Override
	protected String getSQLStatement() {
		return null;
	}

	@Override
	protected void connect() {
		
	}

	@Override
	protected void executeSQLStatement() {
		
	}

	@Override
	protected void disconnect() {
		
	}

}
