package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestAndSmallestInArray {

	public static void main(String[] args) {
		int n[] = {6,1,4,6,8,90,43,23,4,7,96};
		/*
		Set<Integer> set1 = new HashSet<Integer>();
		
		int secondMax = Arrays.stream(n).distinct().sorted().skip(1).findFirst().orElseThrow();
		
		int secondSmallest = Arrays.stream(n).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		
		//System.out.println(secondSmallest);
		
		double[] squareRoot = Arrays.stream(n).mapToDouble(Math::sqrt).distinct().sorted().toArray();
		
		for(double num:squareRoot) {
			System.out.println(num);
		}
		*/
		int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1}; // Missing 8 (range 0 to 9)
        // For range 0 to n, if n is the largest number, then n = nums.length
        // The expected sum formula remains the same if the range is 0 to n.
        int n2 = arr2.length; // Max value in the range if 0 is included
        int expectedSum2 = n2 * (n2 + 1) / 2;
        int actualSum2 = 0;
        for (int num : arr2) {
            actualSum2 += num;
        }
        System.out.println("Missing number in arr2: " + (expectedSum2 - actualSum2));

	}

}
