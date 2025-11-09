package com.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		int ar[] = {4,5,6,7,8,3,7};
		Set<Integer> sent = new HashSet<Integer>();
		boolean duplicate = false;
		for(int i:ar) {
			if(!sent.add(i)) {
				duplicate=true;
				break;
			}else {
				duplicate =false;
			}
		}
		
		
		System.out.println(duplicate);
	}

}
