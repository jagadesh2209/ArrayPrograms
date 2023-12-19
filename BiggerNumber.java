package com.jsp.Arrays;

public class BiggerNumber {

	public static void main(String[] args) 
	{
		int[] a= {33,3,1,6,8,5,9,22,41,2,3,6,9};
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
		  if(a[i]>big)
		  {
			  big=a[i];
		  }
		}
		System.out.println(big);
	}
}
