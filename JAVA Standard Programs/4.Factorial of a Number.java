//4.Factorial of a Number

package com.dkte;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int factorial =1;
		for(int i =1 ;i<=num ; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+num +" is " +factorial);
	}
}
