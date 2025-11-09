package com.test;

public class AddZeroToEndOfArray {

	public static void main(String[] args) {
		int arr[]= {4,0,2,6,0,3,12};
		int index=0;
		for(int n:arr) {
			if(n!=0) {
				arr[index++]=n;
			}
			
		}
		while(index <arr.length) {
			arr[index++]=0;
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
