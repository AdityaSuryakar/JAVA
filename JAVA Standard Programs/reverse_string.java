//1. Reverse a string without using built-in functions

package com.placement;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String reversed = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		System.out.println("Original String : " + str);
		System.out.println("Reverse String : " + reversed);

	}

}
