package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) {
		int n[]= {5,7,8,2,4,7,6,9,10,12,14,1,3,9};
		
		Set<Integer> seen = new HashSet<Integer>();

	int duplicateList[] = Arrays.stream(n).filter(num->!seen.add(num)).toArray();
	
	for(int i:duplicateList) {
		System.out.println(i);
	}
	}

}
