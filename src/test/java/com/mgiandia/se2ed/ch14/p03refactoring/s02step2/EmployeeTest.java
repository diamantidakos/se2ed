package com.mgiandia.se2ed.ch14.p03refactoring.s02step2;



import org.junit.*;

public class EmployeeTest {

	@Test
	public void testGetName() {
		Employee emp = new Employee();
		
		Assert.assertEquals("", emp.toString());
		emp.setFirstName("Nikos");
		
		Assert.assertEquals("Nikos", emp.toString());
		
		
		emp = new Employee();
		emp.setLastName("Diamantidis");
		Assert.assertEquals("Diamantidis", emp.toString());
		
		emp.setFirstName("Nikos");
		Assert.assertEquals("Nikos Diamantidis", emp.toString());		
	}

}
