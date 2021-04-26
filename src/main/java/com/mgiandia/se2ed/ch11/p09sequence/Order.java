package com.mgiandia.se2ed.ch11.p09sequence;

import java.util.*;

public class Order {
	private Set<OrderLine> orderLines = new HashSet<OrderLine>();
	
	public int getTotal() {
		int total = 0;
		for(OrderLine orderLine: orderLines) {
			total += orderLine.getSubTotal();
		}
		return total;
	}
}
