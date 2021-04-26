package com.mgiandia.se2ed.ch13.p05templatemethod.s02dao;

public abstract class BorrowerDAOTemplate implements BorrowerDAO {

	@Override
	public final Borrower find(int borrowerNo) {
		getSQLStatement();
		connect();
		executeSQLStatement();
		disconnect();
		return new Borrower();
	}
	
	protected abstract String getSQLStatement();
	protected abstract void connect();
	protected abstract void executeSQLStatement();
	protected abstract void disconnect();
	

}
