package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		String str[] = {"ate","eat","tea","ten","net","mat"};
		Map<String,List<String>> map = new HashMap<>();
		
		for(String word : str) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
		}
		for(List<String> group:map.values()) {
			System.out.println(group);
		}

	}

}
