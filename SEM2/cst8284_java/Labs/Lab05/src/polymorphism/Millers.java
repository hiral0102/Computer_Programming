/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 22nd March, 2026
 * Modified: 18th March,2026
 * Description: This class is the base class for all types of millers.
 * It stores the name of the miller and provides a method to calculate
 * bi-weekly pay.
 */
package polymorphism;

/**
THIS IS SUPERCLASS NAMED Millers.

Each miller has a name and a method for computing the bi-weekly pay.
YOU DO NOT NEED TO DO MODIFIY THIS CODE. 
*/

public class Millers
{
private String name;

/**
   Constructs a miller with an empty name.
*/
public Millers()
{
   name = "";
}

/**
   Sets the name of this miller.
   @param millerName the new name 
*/
public void setName(String millerName)
{
   name = millerName;
}

/**
   Gets the name of this miller.
   @return the name 
*/
public String getName()
{
   return name; 
}

/**
   This portion of code computes the bi-weekly pay of work done by the miller.
   @param hoursWorked the number of hours worked bi-weekly
   @return the pay for the given number of hours
*/
public double biWeeklyPay(int hoursWorked)
{
   return 0; 
}
}

