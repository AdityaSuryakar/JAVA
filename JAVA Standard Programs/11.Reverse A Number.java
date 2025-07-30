//10.Reverse A Number
package com.dkte;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123 ;
		int reversed = 0;
		while(num != 0) {
			reversed = reversed * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Revrsed: "+reversed);

	}

}
