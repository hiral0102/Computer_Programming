/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 22nd March, 2026
 * Modified: 18th March,2026
 * Description: This class represents supervisors, who are a special type of employee,
 * It extends the employees class and add the bonus to the total pay.
 */
package polymorphism;

/**
This code should contain your Supervisor class declaration, constructor and method. 
A Supervisor is an employee who also receives a bonus. 
You must implement the bi-weekly pay for the employee according to instructions provided.
*/

public class Supervisors extends Employees{
	private double bonus;

/**
 * Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
 * @param name the name of this employee
 * @param pay the annual pay
 * @param bonus the bi-weekly bonus
 */
	public Supervisors(String name, double pay, double bonus) {
		super(name, pay);
		this.bonus = bonus;
	}


	@Override
	public double biWeeklyPay(int hoursWorked) {
		return super.biWeeklyPay(hoursWorked) + bonus;
	}
}




