package com.jsp.Arrays;

public class Assignment {

	public static void main(String[] args) {
		
		int[][] a= {
					{1,2,3},
					{6,5,9},
					{7,9,2}
				};
		dou(a);
		
	}	
	public static void dou(int[][] a)
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
		int r=0,c=-1;
		char m='r';
		
		switch(m)
		{
		case 'r':c++;
				x=a[r][c];
				System.out.print(x);
				if(c==a.length-1||a[r][c+1]!=0); m='d';
				break;
				
		case 'd':r++;
				x=a[c][r];
				System.out.print(x);
				if(r==a.length-1||a[c][c+1]!=0); m='l';
				break;
				
		case 'l': c--;
				x=a[r][c];
				System.out.print(x);
				if(c==0||a[r][c-1]!=0); m='u';
				break;
				
		case 'u':r--;
				x=a[c][r];
				System.out.print(x);
				if(a[r-1][c]!=0); m='r';
				break;
			}
		}
	}
}