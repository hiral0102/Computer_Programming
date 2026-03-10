/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 27th Feb, 2026
 * Modified: 17th Feb, 2026
 * Description: This class tester receive the input from users and call the printLicenceReport().
 * calling the printLicenceReport() from DriversLicence class.
 */
package assignment01;
import java.util.Scanner;
/**
 * This tester class call the printLicenceReport() that shows the output.
 * @author Hiral Prajapati
 */

public class Tester {
	/**
	 * This static method demonstrates that it gives input from user and call the printLicenceReport().
	 * @param arg
	 */
	
	public static void main(String arg[]) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String fname = scnr.nextLine();
		
		System.out.print("Enter Last Name: ");
		String lname = scnr.nextLine();
		
		System.out.print("Enter Eye Color: ");
		String eyeColor = scnr.nextLine();
		
		System.out.print("Enter sex(M/F): ");
		char sex = scnr.next().charAt(0);
		
		scnr.nextLine();
		
		System.out.print("Enter Height: ");
		double height = scnr.nextDouble();
		
		scnr.nextLine();
		
		System.out.print("Enter your date of birth(YYYY-MM-DD): ");
		String dateOfBirth = scnr.nextLine();
		
		System.out.print("Enter Street: ");
		String street = scnr.nextLine();
		
		System.out.print("Enter city: ");
		String city = scnr.nextLine();
		
		System.out.print("Enter province: ");
		String province = scnr.nextLine();
		
		System.out.print("Enter postal Code: ");
		String postalCode = scnr.nextLine();
		
		System.out.print("Enter Licence Number: ");
		String licenceNumber = scnr.nextLine();
		
		System.out.print("Enter Date of Issue: ");
		String issueDate = scnr.nextLine();
		
		DriversLicense d1 = new DriversLicense(fname, lname, eyeColor, sex, height, dateOfBirth, street, city, province, postalCode, licenceNumber, issueDate);
		
		System.out.println(d1.printLicenseReport());
		
		scnr.close();
		
	}

}
