/*
 * Student Name: Hiralben Prajapati
 * Professor Name: Leanne seaward
 * Due Date: 1st Feb, 2026
 * Modified: 23st Jan,2026
 * Description: This spice class shows that traders work in various cities across 12 months.
 * then it gives the total of traders.
 */

/**
* TASK: Remember to include all necessary headers for your Javadoc, descriptions and explanations of what you have done in the appropriate places.
* ENSURE that you add appropriate Javadoc style comments to relevant parts of this code as you update this program to show that you understand it.
*
* @author - various - complete correctly
* 
*/

/**
 * This class describes how many traders work in various cities across 12 months.
 * Rows and columns shows the amount of traders.
 */
public class Spice
{
	/**
	 * The main method shows 2D arrays, prints the table that displays
	 *  monthly total for each city of trader information.
	 * @param args
	 */
public static void main(String[] args)
 {
   final int ROWS = 9;
   final int COLUMNS = 12;
/**
 * In the 2D arrays, each row represents a city and each column represents a month.
 */
   int[][] traders = 
      { 
         { 150, 140, 225, 130, 220, 110, 120, 100, 115, 200, 192, 224 },
         { 220, 137, 26, 82, 502, 615, 209, 947, 116, 214, 278, 238 }, 
         { 103, 203, 276, 308, 172, 246, 354, 118, 123, 310, 146, 152 }, 
         { 210, 260, 234, 108, 149, 202, 216, 58, 244, 155, 167, 221 },
         { 203, 274, 226, 182, 152, 107, 192, 265, 123, 110, 146, 152 },
         { 223, 184, 236, 234, 167, 121, 208, 201, 186, 109, 141, 176 },
	     { 136, 219, 131, 191, 187, 201, 278, 106, 153, 172, 109, 146 },
         { 201, 104, 121, 13, 121, 69, 246, 100, 123, 161, 69, 175 },
         { 100, 235, 106, 222, 175, 143, 208, 157, 163, 141, 208, 189 }
      };

   String[] cities = 
      { 
         "Ottawa", 
         "Perth", 
         "Pembroke",
         "Kingston", 
         "Toronto", 
         "Niagara",
	 "London",
         "Waterloo", 
         "Guelph"
      };
   
   System.out.println("         Month     Jan     Feb    March    April   May    June    July     Aug    Sept     Oct     Nov    Dec");
   System.out.println();
   
/**
 * Using printf in nested for loop, It shows the result as a table.
 */
    
   for(int i = 0; i < ROWS; i++) {
	   System.out.printf("%14s", cities[i] );
	   for(int j = 0; j < COLUMNS; j++) {
		   System.out.printf("%8d", traders[i][j]);
	   }
	   System.out.println();
   }

   
   System.out.println();
   System.out.print("        Traders");

/**
 * This for loop represent the total of spice traders each month.
 */

   for(int j = 0; j < COLUMNS; j++) {
	   int sum = 0;
	   for(int i = 0; i < ROWS; i++) {
		   sum += traders[i][j];
	   }
	   System.out.printf("%8d", sum );
   }
   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Food spice trading yields good profit!" );
}
}




   
   
   
   
   





