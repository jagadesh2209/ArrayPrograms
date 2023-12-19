package com.jsp.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) 
	{
		int[][] a= {{2,3,8},
					{2,4,6},   //horizontal
					{1,3,2}};   //in this program 2.3.8(horizontal) and next array is 2,4,7 vertical 
		
		int[][] b= {{2,1,3},
					{4,5,6},
					{7,8,9}};//vertical values 
		int[][] c=new int[a.length][b.length];
		multiplay(a,b,c);
		for(int[] temp:c)
		{
			for(int n:temp)
			{
				System.out.print(n+" \t");
			}
			System.out.println();
		}
	}
	
	public static void multiplay(int[][] a,int[][] b,int[][] c)
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				int sum=0;
				for(int k=0;k<len;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
	}
}
