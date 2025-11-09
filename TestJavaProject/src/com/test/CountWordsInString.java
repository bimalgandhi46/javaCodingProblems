package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountWordsInString {

	public static void main(String[] args) {
		String sentence = "This is my testing lets see how I can do this";
		String[] splitStr = sentence.split(" ");
		Set<String> seen = new HashSet<>();
		Map<String,Long> seqWordMap = new HashMap<>();
		
		for(String word:splitStr) {
			
			seqWordMap.put(word, seqWordMap.getOrDefault(word, 0L)+1);
		}
		
		for (Map.Entry<String, Long> entry : seqWordMap.entrySet()) {
		    System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}

}
