package com.mgiandia.se2ed.ch11.p09sequence;

public class OrderLine {

	private int quantity;
	private Product product;
	
	public int getSubTotal() {
		return product.getPrice(quantity);
	}
}
