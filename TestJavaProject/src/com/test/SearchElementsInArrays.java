package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SearchElementsInArrays {

	public static void main(String[] args) {
int n[]= {5,7,8,2,4,7,6,9,10,12,14,10,3,9};
		
		Set<Integer> seen = new HashSet<Integer>();
		int target = 1;
		boolean found = Arrays.stream(n).anyMatch(num->num==target);
			if(found) {
				System.out.println("OH yes");
			}else {
				System.out.println("OH not found");
			}
		}
	}

	


