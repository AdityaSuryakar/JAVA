//Q2. Copy the  Point2D class , along with the package from previous assignment. 
//a) Create a class "TestPointArray1.java" in "tester" package for the following 
//b) Accept , how many no of points to plot from user. 
//c) Create suitable data structure 
//Hint : Point2D[] points=new Point2D[sc.nextInt()]; 
//d) Prompt user for x & y co ordinates n store the data suitably 
//Hint : for loop 
//e) Supply Menu to user with various Options like following 
//1. Display details of a specific point 
//User i/p : index 
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!) 
//2)  Display x, y co-ordinates of all points 
//Hint : for-each 
//3) User i/p : 2 indices for the points , validate the indices 
//4. Exit 
//Display distance between specified points (iff they are not located at the same position) 
//eg : sop("Enter index of strt point n end point"); 
//validation : boundary condition (0<=index<length-1) 
//isEqual -- false --compute distance --display it.

package tester;
import com.question3.Point2D;
import java.util.Scanner;
public class TestPointArray1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter the number of points to plot: ");
			int n = sc.nextInt();
			Point2D[] points = new Point2D[n];
			for (int i = 0; i < n; i++) {
				System.out.println("enter x and y for point " + i + ": ");
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				points[i] = new Point2D(x, y);
			}
			boolean exit = false;
			while (!exit) {
				System.out.println("\nMenu:");
				System.out.println("1. Display details of a specific point");
				System.out.println("2. Display all points");
				System.out.println("3. Calculate distance between 2 points");
				System.out.println("4. Exit");
				System.out.print("Choose an option: ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter point index: ");
					int index = sc.nextInt();
					if (index >= 0 && index < n) {
						System.out.println(points[index].getDetails());
					} 
					else {
						System.out.println("Invalid index, please retry!!!!");
					}
					break;
				case 2:
					System.out.println("All points:");
					for (Point2D p : points) {
						System.out.println(p.getDetails());
					}
					break;
				case 3:
					System.out.print("Enter index of start point: ");
					int i1 = sc.nextInt();
					System.out.print("Enter index of end point: ");
					int i2 = sc.nextInt();
					if (i1 >= 0 && i1 < n && i2 >= 0 && i2 < n) {
						if (points[i1].isEqual(points[i2])) {
							System.out.println("Both points are located at the same position.");
						} 
						else {
							double dist = points[i1].calculateDistance(points[i2]);
							System.out.printf("Distance between points: %.2f\n", dist);
						}
					} 
					else {
						System.out.println("Invalid indices,retry");
					}
					break;
				case 4:
					exit = true;
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice, try again.");
				}
			}
		}
	}
}
