package com.jsp.Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		
		int[] a= {0,0,1,0,1,1,0,1};
		int[] b=new int[a.length];
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				b[p++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}
}
