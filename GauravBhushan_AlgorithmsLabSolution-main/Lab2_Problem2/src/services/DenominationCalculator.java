package services;

/*
 * You are a traveler and traveling to a country where the currency denominations are
 * unknown and as you travel, you get to know about the denomination in random order.
 * You want to make a payment of amount x, in such a way that the number of notes you give
 * is minimum.
 * */

public class DenominationCalculator {

	public static int[][] checkPaymentApproach(int[] denominationArray, int paymentAmount) {
		int[][] paymentMethod = new int[denominationArray.length][2];
		
		int payment = paymentAmount;
		MergeSort.sort(denominationArray);		//sort the array in descending order
		
		int index = 0;		//index to be used to update the return array
		for (int i = 0; (i < denominationArray.length) && (payment != 0); i++) {
			if (payment < denominationArray[i])	//if denomination is greater than amount, then skip to next smaller denominator
				continue;
			
			paymentMethod[index][0] = denominationArray[i];		//denomination
			paymentMethod[index][1] = payment / denominationArray[i];	//num of above denomination
			payment %= denominationArray[i];	//remaining amount
			index++;
			
		}
		
		if (payment != 0)		//in case we cannot achieve the amount with given denominations
			paymentMethod[0][0] = -1;
		
		return paymentMethod;
	}
	
}
