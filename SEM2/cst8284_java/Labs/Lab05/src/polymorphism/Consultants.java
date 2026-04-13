/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 22nd March, 2026
 * Modified: 18th march,2026
 * Description: This class represents millers who are paid hourly. 
 * Their pay depends on the number of hours worked. If they work more than 
 * 76 hours in two weeks, they receive extra pay overtime pay.
 */
package polymorphism;

/**
This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/


public class Consultants extends Millers{
	
	private double consultantWage;
	

/**
   This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
   @param name the name of this consultant
   @param wage the consultant wage per hour 
*/
	
	public Consultants(String name, double wage) {
		setName(name);
		consultantWage = wage;
	}
	


@Override
public double biWeeklyPay(int hoursWorked)
{
   double pay = hoursWorked * consultantWage;
   
   if(hoursWorked > 76) {
      pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
   }
      
   return pay;
}
}


