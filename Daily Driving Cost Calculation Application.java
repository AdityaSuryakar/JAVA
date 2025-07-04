//Assignment 4 - Question 1
//Q1. Create an application that calculates your daily driving cost, so that you can estimate how much 
//money could be saved by car pooling, which also has other advantages such as reducing carbon 
//emissions and reducing traffic congestion. The application should input the following information 
//and display the user’s cost per day of driving to work: 
//a) Total miles driven per day. 
//b) Cost per gallon of gasoline. 
//c) Average miles per gallon. 
//d) Parking fees per day. 
//e) Tolls per day. 
package com.dkte;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total miles driven per day:");
        double total_miles = sc.nextDouble();

        System.out.println("Enter cost per gallon of gasoline:");
        double cost_per_gallon = sc.nextDouble();

        System.out.println("Enter average miles per gallon:");
        double avg_miles = sc.nextDouble();

        System.out.println("Enter parking fees per day:");
        double parking_fees = sc.nextDouble();
        System.out.println("Enter tolls per day:");
        double tolls_perday = sc.nextDouble();
        double fuel_cost = (total_miles / avg_miles) * cost_per_gallon;
        double daily_driving_cost = fuel_cost + parking_fees + tolls_perday;
        System.out.println("\nYour total daily driving cost is: " + daily_driving_cost);

        sc.close();
    }
}
