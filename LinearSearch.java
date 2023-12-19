package com.jsp.Arrays;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int []a= {2,5,3,9,8,6,7,6,4};//its print only index value and also allow the UNSORTED values
		System.out.println(search(a,9));
		System.out.println(search(a,1));//if its not available ans its shows only the -1;
	}
	public static int search(int[]a,int ele)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				return i;
			}
		}
		return -1;
	}
}
