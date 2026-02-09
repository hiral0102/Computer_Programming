/*
 * Student Name: Hiralben Prajapati
 * Lab Professor: Leanne seaward
 * Due Date: 28th January
 * Modified: 14th January, 2026
 * Description: This code shows tally button. That gives the value when button is clicked.
 * It demonstrates the click button and getValue return the value. Undo method works when 
 * the getValue comes to zero.
 */
 
/**
 * This class is used to test the buttons of ButtonCounter class.
 */
public class ButtonCounterTester
{
	/**
	 * This main method is creating buttonCounter object and 
	 * testing the methods and printing results to the console.
	 * @param args
	 */
   public static void main(String[] args)
   {
      ButtonCounter tally = new ButtonCounter();
      tally.click();
      tally.click();
      tally.click();
      System.out.println(tally.getValue());
      System.out.println("Expected: 3");
      tally.undo();
      System.out.println(tally.getValue());
      System.out.println("Expected: 2");
      tally.undo();
      tally.undo();
      tally.undo();
      System.out.println(tally.getValue());
      System.out.println("Expected: 0");
   }
}
