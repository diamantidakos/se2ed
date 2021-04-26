package com.mgiandia.se2ed.ch14.p03refactoring.s01step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	@Test
	public void testToString() {
		Employee emp = new Employee();
		
		Assertions.assertEquals("", emp.toString());
		emp.setFirstName("Nikos");
		
		Assertions.assertEquals("Nikos", emp.toString());
		
		emp = new Employee();
		emp.setLastName("Diamantidis");
		Assertions.assertEquals("Diamantidis", emp.toString());
		
		emp.setFirstName("Nikos");
		Assertions.assertEquals("Nikos Diamantidis", emp.toString());		
	}

}
