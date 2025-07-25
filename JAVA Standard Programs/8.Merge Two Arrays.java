//8.Merge Two Arrays
package com.dkte;
import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,2,33,57};
		int[] arr2 = {0,37,23,8};
		int[] merged = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		System.out.println(Arrays.toString(merged));
	}

}
