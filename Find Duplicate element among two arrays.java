//Q1. Declare two Arrays of type String. Find the duplicate values of an array of string values. (Hint: 
//use equals()) 

package com.dkte;

public class FindDuplicate {

	public static void main(String[] args) {
		

		        
		        String[] array1 = {"India", "USA", "SA","India", "AUS", "SL"};
		        String[] array2 = {"AUS","Iraq", "Iran", "SA"};

		        System.out.println("Duplicate values within array1:");
		        for (int i = 0; i < array1.length; i++) {
		            for (int j = i + 1; j < array1.length; j++) {
		                if (array1[i].equals(array1[j])) {
		                    System.out.println(array1[i]);
		                    break; 
		                }
		            }
		        }

		        System.out.println("\nCommon values between array1 and array2:");
		       
		        for (int i = 0; i < array1.length; i++) {
		            for (int j = 0; j < array2.length; j++) {
		                if (array1[i].equals(array2[j])) {
		                    System.out.println(array1[i]);
		                    break;
		                }
		            }
		        }
		    }
		


	

}
