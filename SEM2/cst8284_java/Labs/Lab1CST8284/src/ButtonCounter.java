/*
 * Student Name: Hiralben Prajapati
 * Lab Professor: Leanne seaward
 * Due Date: 28th January
 * Modified: 14th January, 2026
 * Description: This is tally button that represents different outputs 
 * when button is clicked. Firstly getValue() returns the value, it increase 
 * the value by one, then reset all the clicks and lastly if value is greater 
 * than zero, it shows decrement.
 */

/**
 * The ButtonCounter represents that how many times tally Button is clicked.
 */
public class ButtonCounter
{   
	//this is the value of the tally
   private int value;
   
   /** 
    * This is returning the number of times the button is clicked
    * @return value - the number of times the button is clicked
    */
   public int getValue()
   {
   return value; //it returns stored value
   }

   /**
       Increment the value when the button is clicked.
   */
   public void click()
   {
      value++; // increase the value by 1 each time
   }

   /**
    * The counter value back to Zero. Reset all clicks.
    */
   public void reset()
   {
      value = 0; // this value backs to Zero;
   }
   
   /**
    * The value decrease by 1 if value is greater than zero
    */
   public void undo()
   { 
	   // if the value is greater than zero 
	   //it decrease the value by 1
    if(value > 0)
    	
    	value--; 
   }
}
