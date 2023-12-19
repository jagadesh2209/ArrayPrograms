package com.jsp.Arrays;

import java.util.Arrays;

import demoPractice.Array;

public class CheckTheTwoArraysAreAnagram {

	public static void main(String[] args) {
		int[] a= {1,2,3,5};
		int[]b= {5,3,2,1};
		if(m1(a, b))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}

	}
	public static boolean m1(int[]a,int[] b)
	{
		if(a.length!=a.length)
		{
			return false;
		}
		sort(a);
		sort(b);
		if(Arrays.equals(a, b))
		{
			return true;
		}
		return false;
	}
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
