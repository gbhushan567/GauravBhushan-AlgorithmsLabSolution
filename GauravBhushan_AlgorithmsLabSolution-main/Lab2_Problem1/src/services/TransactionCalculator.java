package services;

/*
 * PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They
 * also have a daily target that they must achieve. Given a list of transactions done by
 * PayMoney and a daily target, your task is to determine at which transaction PayMoney
 * achieves the same. If the target is not achievable, then display the target is not achieved.
 * */

public class TransactionCalculator {

	public static int calcTargetNumberOfTransaction(int[] transactionsArray, int target) {
		int i, sumOfTransactions = 0; 
		
		for (i = 0; i < transactionsArray.length; i++) {
			sumOfTransactions += transactionsArray[i];
			
			if (sumOfTransactions >= target) {	//the instance when the target is achieved, we return the value
				return i+1;		//array index starts from 0, so adding 1
			}
		}
		
		return -1;		//solution not possible
	}
	
}
