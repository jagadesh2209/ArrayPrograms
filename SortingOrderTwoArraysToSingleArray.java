package com.jsp.Arrays;

public class SortingOrderTwoArraysToSingleArray {

	public static void main(String[] args) {

		int[] a= {5,12,17,20};
		int[] b= {3,7,10,13,19};
		int[] temp=new int[a.length+b.length];
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			temp[p++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			temp[p++]=b[i];
		}
//		Arrays.sort(temp);//this is wrong we cannt use this method 
		
		m1(temp);  //bubble sort
		
		for(int n:temp)
		{
			System.out.print(n+" ");
		}
	}
	public static void m1(int[] a)
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
