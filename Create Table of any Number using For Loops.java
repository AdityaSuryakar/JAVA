//Q.Create multiplication table of given number


package com.dkte;
import java.util.Scanner;
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		int table;
		for(int i = 1; i<=10;i++) {
			table = num * i;
			System.out.println("The table of number is :"+table);
		}
		sc.close();
	}

}
