//9.Find Largest Element in an Array
package com.dkte;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-11,2,0,3,4,500,6};
		int largest = arr[0];
		for(int i =1 ; i<arr.length; i++) {
			if(arr[i]> largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest : "+largest);
	}

}
