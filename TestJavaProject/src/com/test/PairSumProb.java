package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSumProb {

	public static void main(String[] args) {
		int[] arr = {1,2, 4, 3, 5, 7, 8, 1};
		int target = 8;
		int complement =0;
		List<int[]> pairs = new ArrayList<>();
		Set<Integer> seen = new HashSet<Integer>();
		
		for(int i:arr) {
			complement = target-i;
			if(seen.contains(complement)) {
				 pairs.add(new int[]{i, complement});

			}
			seen.add(i);
			
		}
		
		for(int[] j:pairs) {
			System.out.println(j[0]+","+j[1]);
		}
	}

}
