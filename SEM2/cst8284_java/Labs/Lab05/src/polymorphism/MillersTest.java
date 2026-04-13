/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 22nd March, 2026
 * Modified: 18th March,2026
 * Description: This is the main class that runs the program. It creates different 
 * types of millers and stores them in the array. It asks users to enter the hours worked
 * and it calculates and display the pay for each millers.
 */
package polymorphism;

import java.util.Scanner;

/**
   This class is called the MillerTest Class and provides the main method for your program.
   This program shows polymorphism by applying a method to objects of different classes. 
   Note that in your program, the Users should be prompted to input hours done worked by each miller. 
   You must implement using an array. 
   The order of the workers in the output is Consultants, Employees and Supervisors.
   Use the names in the output sample file provided for you. 
   Assume an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
*/


public class MillersTest{
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   
	   Millers[] millers = new Millers[3];
	   
	   millers[0] = new Consultants("Abby, Obi", 30);
	   millers[1] = new Employees("Andrew, Goodman", 30000);
	   millers[2] = new Supervisors("Gloria, Myres", 52000, 50);
	   
	   int hoursWorked;
	   
	   for(int i = 0; i < millers.length; i++) {
		   System.out.print("Enter the hours done by " + millers[i].getName() + ":");
		   hoursWorked = scnr.nextInt();
		   
		   double pay = millers[i].biWeeklyPay(hoursWorked);
		   
		   System.out.printf("Total Pay for this miller is: %.2f\n" , pay );
		   System.out.println();
	   }
	   scnr.close();
	   
	  }
}


