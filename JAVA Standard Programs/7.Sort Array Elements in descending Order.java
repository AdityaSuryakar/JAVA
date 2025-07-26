//7.Sort Array Elements in descending Order
package com.dkte;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,22,3,4,-36,200};
		Arrays.sort(arr);
		reverse(arr);
		System.out.println("Sorted Array(desc):"+Arrays.toString(arr));
		
	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i=0 ; i<n/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
			
		}
	}

}
