package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCaseUsingStream {

	public static void main(String[] args) {
		List<String> fruits= Arrays.asList("apple","peach","grape","orange","mango","watermelon");
		
		List<String> upperCase = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upperCase);
		
	}

}
