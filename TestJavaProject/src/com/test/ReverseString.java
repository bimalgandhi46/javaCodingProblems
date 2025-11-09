package com.test;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse string using manual loop
		String str = "hello";
		
		String reverseStr = "";
		for(int i=str.length()-1;i >=0;i--) {
			reverseStr+=str.charAt(i);
		}
		System.out.println(reverseStr);

	
	
	//Reverse string with StringBuilder
	
	String str1 = "hola";
	String reverse = new StringBuilder(str1).reverse().toString();
	System.out.println(reverse);
	
	//
}
}