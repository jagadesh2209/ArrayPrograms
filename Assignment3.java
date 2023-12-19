package com.jsp.Arrays;

public class Assignment3 {

	public static void main(String[] args) {

		int[] a= {2,18,13,3,7};
		if(m1(a))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static boolean m1(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)
			{
				return true;
			}
		}
		return false;
	}
}
