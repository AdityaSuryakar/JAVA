/* Write a program to generate following pattern 

      * 
     * * 
    * * * 
   * * * * 
  * * * * *   */


package Assignment1;

public class question3 {

	public static void main(String[] args) {
	
	        for (int i = 1; i <= 5; i++) {
	            for (int j = i; j < 5; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	}
}
}
