package com.jsp.Arrays;

public class SmallestNumber {

	public static void main(String[] args) 
	{
		int[] a= {1,4,5,6,8,2,5,9,6,0};
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<small)
			{ 
				small=a[i];
			}
		}
		System.out.println(small+" is the Smallest Number in the given Array");
	}
}
