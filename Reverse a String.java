//Q2. Write a java program to reverse a String 

package com.dkte;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "adi";
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
		System.out.println("Original String :"+ str);
		System.out.println("Reversed Steing :"+ temp);
		}

	}


