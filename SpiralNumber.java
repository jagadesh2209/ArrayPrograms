 package com.jsp.Arrays;

public class SpiralNumber 
{
	public static void main(String[] args) 
	{
		int[][] a=spiralNumber(5);
		for(int[] temp:a)
		{
			for(int n:temp) 
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}
	public static int[][] spiralNumber(int size)
	{
		int[][] a=new int[size][size];
		int r=0,c=-1;
		char m='r';
		for(int i=1;i<=(size*size);i++)
		{
			switch(m) 
			{
			case 'r': c++;
					  a[r][c]=i;
					  if(c==size-1||a[r][c+1]!=0); m='d';
					  break;
					  
			case 'd':
				r++;
				a[r][c]=i;
				if(c==size-1||a[r+1][c]!=0); m='l';
				break;
				
			case 'l':
				c--;
				a[r][c]=i;
				if(c==0||a[r][c-1]!=0); m='u';
				break;
				
			case 'u':
				r--;
				a[r][c]=i;
				if(a[r-1][c]!=0) m='r';
				break;
			}
		}
		return a;
	}
}

