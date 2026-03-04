

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest01 {

	private static final double EPSILON = 1E-12;
	
	//Test 1: calculate the change
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment.
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE individual TEST CASES 
		//  (NOT ALREADY STATED IN THIS CODE) TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	
	// Test 2: Test recordPurchase method
	@Test
	public void testRecordPurchase() {
		//first create object
		YourPurchases register = new YourPurchases();
		
		//get actual value from the method being tested
		register.recordPurchase(2.50);
		double actual = register.getPurchase();
		
		//get expected from my brain or calculator
		double expected = 2.50;
		
		//Compare the 2 using Epsilon
		Assert.assertEquals(actual, expected, EPSILON);
	}
	
	//Test 3: Test testReceivePayment method
	@Test
	public void testRecievePayment() {
		
		YourPurchases register = new YourPurchases();
		
		register.receivePayment(2, 2, 0, 0, 0);
		double actual = register.getPayment();
		
		double expected = 2.50;
		
		Assert.assertEquals(actual, expected, EPSILON);
		
	}
	
	//Test 4: Test mutiplePerchases method
	@Test
	public void testMultiplePurchases() {
		YourPurchases register = new YourPurchases();
		
		register.recordPurchase(1.00);
		register.recordPurchase(3.00);
		double actual = register.getPurchase();
		
		double expected = 4.00;
		
		Assert.assertEquals(actual, expected, EPSILON);
	}
	
	//Test 5: Calculate Change
	@Test
	public void testRecievePaymentsWithCoins() {
		YourPurchases register = new YourPurchases();
		register.receivePayment(6, 0, 0, 0, 0);
		double actual = register.getPayment();
		
		double expected = 6.00;
		Assert.assertEquals(actual, expected, EPSILON);
		
	}
	
	//Test 6: initialize the value
	@Test 
	public void testIntialValues() {
		YourPurchases register = new YourPurchases();
		double actualPurchase = register.getPurchase();
		double actualPayment = register.getPayment();
		
		double expectedPurchase = 0.0;
		double expectedPayment = 0.0;
		
		Assert.assertEquals(expectedPurchase, actualPurchase, EPSILON);
		Assert.assertEquals(expectedPayment, actualPayment, EPSILON);
	}
	
	//Test 7: receive payments with only dollars
	@Test
	public void testReceivePaymentDollarsOnly() {
		YourPurchases register = new YourPurchases();
		register.receivePayment(3, 0, 0, 0, 0);
		double actual = register.getPayment();
		double expected = 3;
		
		Assert.assertEquals(expected, actual, EPSILON);
	}
	
}
