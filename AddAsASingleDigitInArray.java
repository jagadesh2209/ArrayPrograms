 package com.jsp.Arrays;

public class AddAsASingleDigitInArray {

	public static void main(String[] args) 
	{
		int[] a= {223,999,273,2};
		int[] b=new int[a.length];
		int k=0;
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			k=m1(a[i]);
			if(k>9)
			{
				b[i]=m1(k);
			}
			else {
				b[i]=k;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
//		System.out.println(a.length);
//		System.out.println(b.length);
	}
	public static int m1(int a)
	{
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		return sum;
	}
}
