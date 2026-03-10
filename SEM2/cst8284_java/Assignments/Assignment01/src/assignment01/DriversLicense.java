/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 27th Feb, 2026
 * Modified: 17th Feb, 2026
 * Description: This class DriversLicence shows the private data types, default constructor, Parameterized Constructor,
 * and calls other methods to main method and print from String printLicenceReport().
 */

package assignment01;

import java.time.LocalDate;
import java.time.Period;
/**
 * The DriversLicense class demonstrates am Ontario driver's license.
 * It stores personal, address, licence and date details. It also provides methods
 * to expiry duration, compute age, issue days ad formatted licence reports.
 * @author Hiral Prajapati
 */

public class DriversLicense {
	
	//personal info
	private String firstName;
	private String lastName;
	private String eyeColor;
	private char sex;
	private double height;
	private String dateOfBirth;
	
	//Address info
	private String street;
	private String city;
	private String province;
	private String postalCode;
	
	//Licence info
	private String licenceNumber;
	private String licenceClass;
	private String restrictions;
	
	//Dates in License
	private String issueDate;
	private String expiryDate;
	
	/**
	 * Default Constructor that initializes 
	 * the objects with sample values.
	 */
	
	//Default Constructor
	public DriversLicense() {

		this(
				"Hermione",
				"Granger",
				"Brown",
				'F',
				165.00,
				"2007-01-10",
				"123 Sampe Street",
				"Ottawa",
				"ON",
				"K2K2K2",
				"D6101-40706-60905",
				"G",
				"None",
				"2019-01-01",
				"2026-01-01"
				);
		
				
	}


	/**
	 * Parameterized constructor that initializes 
	 * all fields of the DriversLicence object.
	 * @param fname
	 * @param lname
	 * @param eyeColor
	 * @param sex
	 * @param height
	 * @param dateOfBirth
	 * @param street
	 * @param city
	 * @param province
	 * @param postalCode
	 * @param licenceNumber
	 * @param licenceClass
	 * @param restrictions
	 * @param issueDate
	 * @param expiryDate
	 */
	
	//Full parameterized constructor
	public DriversLicense(String fname, String lname, String eyeColor, char sex, double height, String dateOfBirth, String street, String city,
			String province, String postalCode, String licenceNumber, String licenceClass, String restrictions, String issueDate,
			String expiryDate) {

		// TODO Auto-generated constructor stub
		this.firstName = fname;
		this.lastName = lname;
		this.eyeColor = eyeColor;
		this.sex = sex;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.licenceNumber = licenceNumber;
		this.licenceClass = licenceClass;
		this.restrictions = restrictions;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		
	
	}
	
	/**
	 * constructor that assigns values for license class and restrictions.
	 * @param fname
	 * @param lname
	 * @param eyeColor
	 * @param sex
	 * @param height
	 * @param dateOfBirth
	 * @param street
	 * @param city
	 * @param province
	 * @param postalCode
	 * @param licenceNumber
	 * @param issueDate
	 */
	
	//Second parameterized constructor
	
	public DriversLicense(String fname, String lname, String eyeColor, char sex, double height, String dateOfBirth, String street, String city, String province, String postalCode, String licenceNumber, String issueDate) {
		this(
				fname,
				lname,
				eyeColor,
				sex,
				height,
				dateOfBirth,
				street,
				city,
				province,
				postalCode,
				licenceNumber,
				"G",
				"None",
				issueDate,
				"expiryDate"
				);
	}
	
	/**
	 * License expiry is calculated as 5 years after issue date.
	 * @return
	 */
	
	public int computeDaysToExpiry() {
		LocalDate issue = LocalDate.parse(issueDate);
		LocalDate expiry = issue.plusYears(5);
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(today, expiry);
		
	    int days = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
	    return days;
		
	}
	
	/**
	 * Calculates the age of the driver.
	 * @return
	 */
	
	public int computeDriverAge() {
	    LocalDate birthDate = LocalDate.parse(dateOfBirth);
		return  LocalDate.now().getYear() - birthDate.getYear();
	}
	
	/**
	 * Calculates total number of days since the license was issued.
	 * @return
	 */
	public int computeDaysSinceIssue() {
		LocalDate issue = LocalDate.parse(issueDate);
	    int days = 0;
	    while (issue.isBefore(LocalDate.now())) {
	        issue = issue.plusDays(1);
	        days++;
	    }
	    return days;
	}
	/**
	 * Calculates total number of years since the license was issued.
	 * @return
	 */
	
	public int computeYearsSinceIssue() {
		LocalDate userInputYear = LocalDate.parse(issueDate);
		return LocalDate.now().getYear() - userInputYear.getYear();
	}
	/**
	 * Convert height from centimeters to inches.
	 * @return
	 */
	
	
	public double computeHeightInInches() {
		return height / 2.54;
	}
	/**
	 * Generates a formatted driver's license report.
	 * @return
	 */
	
	public String printLicenseReport() {
		 return String.format(
			        "Ontario Driver's License Report\n" +
	        	    "%-20s : %s %s\n" +
	        		"%-20s : %c\n" +
	        	    "%-20s : %s\n" + 
	        		"%-20s : %.1f inches\n" + 
	        	    "%-20s : %s\n" +  
	        		"%-20s : %s, %s, %s, %s\n" +  
	        	    "%-20s : %s\n" + 
	        		"%-20s : %s\n" +  
	        	    "%-20s : %s\n" +  
	        		"%-20s : %d years\n" +  
	        	    "%-20s : %d days\n" +  
	        		"%-20s : %d years\n" +  
	        	    "%-20s : %d days\n",

			        		
			        "Name", firstName, lastName,
			        "Sex", sex,
			        "Eye Colour", eyeColor,
			        "Height", computeHeightInInches(),
			        "Date of Birth", dateOfBirth,
			        "Address",street, city, province, postalCode,
			        "Licence Number",licenceNumber,
			        "Licence Class",licenceClass,
			        "Restrictions",restrictions, 
			        "Age",computeDriverAge(),
			        "Days Since Issue", computeDaysSinceIssue(),
			        "Years SInce Issue", computeYearsSinceIssue(),
			        "Days To Expiry", computeDaysToExpiry()
			    );
		 
	}
	
	

}
