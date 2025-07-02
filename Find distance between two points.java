//ASSIGNMENT2-Q3. Create a class Point2D , in package - "com.app.geometry"   : for representing a point in x-y co
//ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return 
//string form of  point's x & y co-ords 
//Hint :  public String getDetails()) 
//Add isEqual method to Point2D class :a boolean returning method : must return true if n only if both 
//points are having same x,y co-ords or false otherwise. 
//Add calculateDistance method to calculate distance between current point and specified point & 
//return the distance to the caller. 
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc. 
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points from 
//user (Scanner) --to create 2 points (p1 & p2) 
//Use getDetails method to display point details.(p1's details & p2's details) 
//`Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position) 
//If they are not located at the same position , display distance between p1 & p2 

package com.question3;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {	
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point Coordinates: (" + x + ", " + y + ")";
    }

    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public double calculateDistance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}

//Tester
package tester;

import com.question3.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates for Point 2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Both points are the same.");
            System.out.println("Distance: 0");
        } else {
            System.out.println("Points are not equal.");
            System.out.println("Distance: " + p1.calculateDistance(p2));
        }

        sc.close();
    }
}
