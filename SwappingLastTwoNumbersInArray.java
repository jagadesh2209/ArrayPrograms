 package com.jsp.Arrays;

public class SwappingLastTwoNumbersInArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,6,58,97,15};
		System.out.println("the array elemetns Before swapping ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		int firstIndex=a.length-2,secondIndex=a.length-1;
		
		a[firstIndex]=a[firstIndex]+a[secondIndex];
		a[secondIndex]=a[firstIndex]-a[secondIndex];
		a[firstIndex]=a[firstIndex]-a[secondIndex];
		System.out.println("the array elements after swapping");
		for(int i:a)
		{
			System.out.print(i+" ");				
		}
	}
}
