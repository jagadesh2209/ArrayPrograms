package com.jsp.Arrays;

public class Transpose {

	public static void main(String[] args) 
	{
		int[][]a={
				{1,2,3},
				{5,6,4},
				{8,9,7}
		};
		int[][] b=transpose(a);
		for(int[] temp:b)
		{
			for(int n:temp)
			{
				System.out.print(n+" \t");
			}
			System.out.println();
		}
	}
	
	public static int[][] transpose(int[][] a)
	{
		int len=a.length;
		int[][] b=new int[len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		return b;
	}
}
