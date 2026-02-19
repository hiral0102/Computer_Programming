
package lab3;

import winter26lab3.EventSchedule;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */
/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 8st Feb, 2026
 * Modified: 29st Jan,2026
 * Description: This class TestDemo creates objects, print labels and 
 * call createReport() to show output.
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Hiralben Prajapati
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	
	/**
	 * YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
	*/

	public static void main(String[] args) {

		System.out.println("Just creating 4 EventSchedules\n");
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());
		
		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2023).createReport());
		
		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2023, 12).createReport());
		
		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2023, 12, 15).createReport());
	
	}

}
