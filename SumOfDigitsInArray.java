package com.jsp.Arrays;

public class SumOfDigitsInArray {

	public static void main(String[] args) {
		int[] a= {36,3,2,15,6};
		int sum=0;
		
//		for(int n:a)
//		{
//			sum+=n;
//		}
//		System.out.println(sum);
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
