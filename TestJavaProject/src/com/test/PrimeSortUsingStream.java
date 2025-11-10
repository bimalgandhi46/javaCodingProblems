package com.test;

import java.util.Arrays;

public class PrimeSortUsingStream {

	public static void main(String[] args) {
		int n[] = {4,7,9,1,2,3,11,12,14,13,15,16,17};
		
		int sortedPrime[] = Arrays.stream(n).filter(x->isPrime(x)).sorted().toArray();

		for(int num:sortedPrime) {
			System.out.println(num);
		}
	}

	private static boolean isPrime(int num) {
		 if (num <= 1) return false;
		    if (num == 2) return true;
		    if (num % 2 == 0) return false;
		    for (int i = 3; i <= Math.sqrt(num); i += 2) {
		        if (num % i == 0) return false;
		    }
		    return true;

	}

}
