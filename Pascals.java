package com.jsp.Arrays;

public class Pascals {

	public static void main(String[] args) 
	{
		int size=5;
		int[][] a=pascals(size);
		int space=size-1;
		for(int[] temp:a)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int n:temp)
			{
				System.out.print(n+" ");
			}
			System.out.println();
			space--;
		}
	}
	public static int[][] pascals(int size)
	{
		int[][] a =new int[size][size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0||i==j)
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}
}