//2.Check for Palindrome

package com.dkte;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "POP";
		StringBuilder reversed = new StringBuilder(str).reverse();
		if (str.equals(reversed.toString())) {	//"equals method"
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
