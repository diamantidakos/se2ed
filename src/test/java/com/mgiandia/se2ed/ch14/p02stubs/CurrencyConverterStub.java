package com.mgiandia.se2ed.ch14.p02stubs;

import com.mgiandia.se2ed.ch14.p02stubs.CurrencyConverter;

public class CurrencyConverterStub implements CurrencyConverter {

	private int conversionFactor;
	
	public CurrencyConverterStub(int conversionFactor) {
		this.conversionFactor = conversionFactor;
	}


	public int eurosToDollars(int euros) {
		return conversionFactor * euros;
	}
}
