package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterSequence {

	public static void main(String[] args) {
		
		/*
		Map<Character,Integer> map = new HashMap<>();
		Set<Character> memory  = new HashSet<Character>();
		//Following find repeated characters in strings 
		for(int i=0;i < str.length();i++) {
			char ch = str.charAt(i);
			if(!memory.add(str.charAt(i))) {
				map.put(ch,map.getOrDefault(ch,1)+1);
			}
			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " → " + entry.getValue());
		}*/

		//This is will find all the sequence in characters
		String str1 ="I would like to read this but I can't read it can you help me I want to know please if you can help me "
				+ "THis is seem like fun stuff but that is what is I can't see I can feel  it can you feel it can you feel it";
		Map<Character,Long> seqmap = new HashMap<>();
		
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			seqmap.put(ch,seqmap.getOrDefault(ch,0L)+1);
		}
		for (Map.Entry<Character, Long> entry : seqmap.entrySet()) {
		    System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}

}
