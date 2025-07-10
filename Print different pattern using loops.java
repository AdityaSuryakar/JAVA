package com.dkte;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 4;
		//Pattern 1
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Pattern 2
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
