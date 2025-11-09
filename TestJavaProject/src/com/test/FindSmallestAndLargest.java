package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallestAndLargest {

	public static void main(String[] args) {
		//Find the smallest and largest values in arrays
		
		int n[]= {9,8,7,6,5,4,3,2,1,0};
		
		
		int max = Arrays.stream(n).max().orElseThrow();
		int min = Arrays.stream(n).min().orElseThrow();
		int sumOfArray =Arrays.stream(n).sum();
		
		boolean checkSortedAsc = IntStream.range(0, n.length-1).allMatch(i->n[i]<=n[i+1]);
		boolean checkSortedDesc = IntStream.range(0, n.length-1).allMatch(i->n[i]>=n[i+1]);
		System.out.println(max+" "+min+" "+checkSortedAsc+" "+checkSortedDesc+" "+sumOfArray);

	}

}
