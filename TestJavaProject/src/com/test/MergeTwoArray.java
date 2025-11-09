package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5,6};
		int a2[] = {7,8,9};
		int merge[] = new int[a1.length+a2.length];
		int index=0;
		for(int n:a1) {
			merge[index++] = n;
		}
		for(int o:a2) {
			merge[index++]=o;
		}
		

	
	//Stream method
	
	int a3[] = {1,2,3,4,5,6};
	int a4[] = {7,8,9};
	
	int [] merge1= IntStream.concat(Arrays.stream(a3),Arrays.stream(a4)).toArray();
	
	for(int x:merge1) {
		System.out.println(x);
	}

	}
}
