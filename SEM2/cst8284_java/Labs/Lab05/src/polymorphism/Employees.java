/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 22nd March, 2026
 * Modified: 18th March,2026
 * Description: This class represents millers who receive a fixed annual salary. 
 * Their bi-weekly pay is calculated by dividing their yearly salary by 26.
 */
package polymorphism;

/**
This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/

public class Employees extends Millers{
	private double annualPay;

/**

   Constructs an employee with a given name and an annual pay.
   @param name the name of this employee
   @param pay the annual pay of the employee
 */
public Employees(String name, double pay)
{
   setName(name);
   annualPay = pay;
}


 @Override
public double biWeeklyPay(int hourWorks) {
	return annualPay / 26;
}
}



