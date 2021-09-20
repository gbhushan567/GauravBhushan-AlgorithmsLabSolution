package main;

/*
 *	PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They
 *  also have a daily target that they must achieve. Given a list of transactions done by
 *  PayMoney and a daily target, your task is to determine at which transaction PayMoney
 *  achieves the same. If the target is not achievable, then display the target is not achieved. 
 *  
 */

import java.util.Scanner;
import services.TransactionCalculator;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int arraySize = sc.nextInt();					//size of array
		int[] transactionArray = new int[arraySize];	//array to store transaction values
		
		System.out.println("Enter the values of transactions: ");
		for (int i = 0; i < arraySize; i++) {
			transactionArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number of targets that needs to be achieved: ");
		int numTargets = sc.nextInt();
		int targetValue;		//to be asked to user
		int numOfTransactions;	//to store the solution
		
		for (int i = 0; i < numTargets; i++) {
			System.out.println("Enter the value of target: ");
			targetValue = sc.nextInt();
			
			numOfTransactions = TransactionCalculator.calcTargetNumberOfTransaction(transactionArray, targetValue);		//soultion
			
			if (numOfTransactions != -1) 	//in case solution is not possible
				System.out.println("\nTarget is achieved in " + numOfTransactions + " transactions.");
			else							//solution is possible
				System.out.println("\nGiven target is not achieved!");
		}
		
		sc.close();
	}

}
