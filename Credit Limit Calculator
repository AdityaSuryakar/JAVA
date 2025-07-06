//(Credit Limit Calculator) 
//Develop a Java application that determines whether any of several 
//department-store customers has exceeded the credit limit on a 
//charge account. 
//For each customer,the following facts are available: 
//a) account number 
//b) balance at the beginning of the month 
//c) total of all items charged by the customer this month 
//d) total of all credits applied to the customer’s account this 
//month 
//e) allowed credit limit. 
//The program should input all these facts as integers, calculate 
//the new balance (= beginning balance+ charges – credits), 
//display the new balance and determine whether the new balance 
//exceeds the customer’s credit limit. For those customers whose 
//credit limit is exceeded, the program should display 
//the message "Credit limit exceeded"

package com.dkte;
import java.util.Scanner;
public class CreditLimitCalculator {
    private int accNum;
    private int beginningBalance;
    private int charges;
    private int credits;
    private int creditLimit;

    public CreditLimitCalculator(int accNum, int beginningBalance, int charges, int credits, int creditLimit) {
        this.accNum = accNum;
        this.beginningBalance = beginningBalance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }

    public int calculateNewBalance() {
        return beginningBalance + charges - credits;
    }

    public void displayStatus() {
        int newBalance = calculateNewBalance();
        System.out.println("Account Number: " + accNum);
        System.out.println("New Balance: " + newBalance);
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded.\n");
        } else {
            System.out.println("Within credit limit.\n");
        
        }
        
    }
}


--------------------------------------------------------------------------------------------------


package com.dkte;

import java.util.Scanner;

public class TestCreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers: ");
        int n = sc.nextInt();

        CreditLimitCalculator[] customers = new CreditLimitCalculator[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Customer #" + (i + 1));

            System.out.print("Account Number: ");
            int accNum = sc.nextInt();

            System.out.print("Beginning Balance: ");
            int beginBalance = sc.nextInt();

            System.out.print("Total Charges: ");
            int charges = sc.nextInt();

            System.out.print("Total Credits: ");
            int credits = sc.nextInt();

            System.out.print("Allowed Credit Limit: ");
            int creditLimit = sc.nextInt();

            customers[i] = new CreditLimitCalculator(accNum, beginBalance, charges, credits, creditLimit);
        }

        System.out.println("\n==== Results ====");
        for (CreditLimitCalculator c : customers) {
            c.displayStatus();
        }

        sc.close();
    }
}
