//10.Remove Duplicates from Array

package com.dkte;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 10, 45};
		int n = arr.length;

		System.out.println("Array after removing duplicates:");

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

