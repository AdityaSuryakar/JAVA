package programs;
import java.util.Calendar;
import java.util.Scanner;
class Date{
	//Fields
	private int day,month,year;
//	private int month;
//	private int year;
	
	//Constructor
	public Date( ) {
		   System.out.println("--Date--");
		   Calendar c = Calendar.getInstance(); 
		   day = c.get(Calendar.DATE); 
		   month = c.get(Calendar.MONTH) + 1; 
		   year = c.get(Calendar.YEAR); 
		}
	
	//Methods
	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Day :");
		day = sc.nextInt();
		System.out.println("Month :");
		month = sc.nextInt();
		System.out.println("Year");
		year = sc.nextInt();
	}
	
	public void printDate() {
		System.out.println("Day :"+day);
		System.out.println("Month :"+month);
		System.out.println("Year :"+year);
	}
}



public class demo01 {

	public static void main(String[] args) {
		//Creating Instance
		Date dt1 = new Date(); 
		//Calling Methods
		dt1.acceptDate();
		dt1.printDate();
	
		
	}

}
