package com.jsp.Arrays;

public class Demo3 
{
	public static void main(String[] args) 
	{
		int[] arr1= {10,20,30,40};
		m1(arr1);
		for(int n:arr1)
		{
			System.out.print(n+" ");
		}
	}
	static void m1(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]+=2;
		}
	}

}
