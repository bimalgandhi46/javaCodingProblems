package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NonRepeatingCharInString {

	public static void main(String[] args) {
		String str = "teeterllamamppr";
		char[] ch = str.toCharArray();
		Map<Character,Integer> memoryMap= new HashMap<>();
	
		for(char c : ch) {
			memoryMap.put(c, memoryMap.getOrDefault(c,0)+1);
		}
		List<Character> chList = new ArrayList<Character>();
		char firstChar = 0 ;
		for(char i:ch) {
			if(memoryMap.get(i)==1) {
				firstChar = i;
				break;
			}
			
		}
		if(firstChar!=0l) {
		System.out.println(firstChar);
		}else {
		System.out.println("Can't find unique char");
		
	}

	}
}
