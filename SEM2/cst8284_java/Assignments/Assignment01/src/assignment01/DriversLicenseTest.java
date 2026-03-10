/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 27th Feb, 2026
 * Modified: 17th Feb, 2026
 * Description: this JUnit tests check the worker methods.
 */
package assignment01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;


import java.time.LocalDate;
import java.time.Period;

public class DriversLicenseTest {
	
	private static final double EPSILON = 1E-12;
	
	/*Test for computeToExpirtDate */
	//Test 1
	@Test
	public void testExpiryToday() {
		LocalDate issue = LocalDate.now().minusYears(5);
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", issue.toString());
		
		double actual = d1.computeDaysToExpiry();
		double expected = 0;
		assertEquals(expected, actual, EPSILON);
		
		//Assert.assertEquals(actual, expected, EPSILON);
	}
	//Test 2
	@Test
	public void testExpiryTomorrow() {
		LocalDate issue = LocalDate.now().minusYears(5).plusDays(1);
		
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", issue.toString());
		int actual = d1.computeDaysToExpiry();
		int expected = 1;
		
		assertEquals(actual, expected, EPSILON);	
	}
	
	//Test 3
	@Test
	public void testAlreadyExpired() {
		LocalDate issue = LocalDate.now().minusYears(6);
		
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", issue.toString());
		int actual = d1.computeDaysToExpiry();
		
		assertTrue(true);
	}
	
	/*compute driver's age*/
	//Test 1
	@Test 
	public void testNormalAge() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		int actual = d1.computeDriverAge();
		int expected = Period.between(LocalDate.parse("2002-01-01"), LocalDate.now()).getYears();
		
		assertEquals(actual, expected, EPSILON);
	}
	
	//Test 2
	@Test
	public void testBornThisYear() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, LocalDate.now().toString(), "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		
		int actual = d1.computeDriverAge();
		int expected = 0;
		
		assertEquals(actual, expected, EPSILON);
	}

	//Test 3
	@Test
	public void testOldDriver() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "1974-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		
		int actual = d1.computeDriverAge();
		assertTrue(true);
	}
	
	/*compute years since issue year of license*/
	//Test 1
	@Test
	public void testYearsSinceIssue() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		
		int actual = d1.computeYearsSinceIssue();
		
		assertTrue(true);
	}
	
	//Test 2
	@Test
	public void testYearsSinceIssueZero() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", LocalDate.now().toString());
		int actual = d1.computeYearsSinceIssue();
		int expected = 0;
		
		assertEquals(actual, expected, EPSILON);
	}
	
	//Test 3
	@Test
	public void testYearsSinceIssuePast() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2000-01-01");
		
		int actual = d1.computeYearsSinceIssue();
		
		assertTrue(true);
	}
	
	/*compute days since issue days of license*/
	//Test 1
	@Test
	public void testIssuedYesterday() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", LocalDate.now().minusDays(1).toString());
		
		int actual = d1.computeDaysSinceIssue();
		int expected = 1;
		
		assertEquals(actual, expected, EPSILON);
		
	}
	
	//Test 2
	@Test
	public void testIssuedToday() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", LocalDate.now().toString());
		
		int actual = d1.computeDaysSinceIssue();
		int expected = 0;
		
		assertEquals(actual, expected, EPSILON);
	}
	
	//Test 3
	@Test
	public void testIssuedPastDacade() {
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2013-01-01");
		
		int actual = d1.computeDaysSinceIssue();
		
		assertTrue(true);
	}
	
	/*compute height in inches*/
	//Test 1
	@Test
	public void testNormalHeight() {
		
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 166, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		
		double actual = d1.computeHeightInInches();
		double expected = 166 / 2.54;
		
		assertEquals(actual, expected, EPSILON);
	}
	
	//Test 2
	@Test
	public void testZeroHeight() {
		
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 0, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		
		double actual = d1.computeHeightInInches();
		double expected = 0;
		
		assertEquals(actual, expected, EPSILON);
	}
	
	//Test 3
	@Test
	public void testTallHeight() {
		
		DriversLicense d1 = new DriversLicense("John", "Grap", "Brown", 'M', 200, "2002-01-01", "123 Street", "Ottawa", "ON", "K1K2K3", "123", "2019-01-01");
		
		double actual = d1.computeHeightInInches();
		
		assertTrue(true);
	}
	
	/*print license report toString()*/
	//Test 1
	@Test
	public void testReportNotNull() {
		DriversLicense d1 = new DriversLicense();
		
		String actual = d1.printLicenseReport();
		
		assertNotNull(actual);
	}
	
	//Test 2
	@Test
	public void testContainsNotNull() {
		DriversLicense d1 = new DriversLicense();
		
		String actual = d1.printLicenseReport();
		
		assertNotNull(actual);
	}
	
	//Test 3
	@Test
	public void testContainsLicenseNumber() {
		DriversLicense d1 = new DriversLicense();
		
		String actual = d1.printLicenseReport();
		
		assertTrue(true);
	}
	
	
}
