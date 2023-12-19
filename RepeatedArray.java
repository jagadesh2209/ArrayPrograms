package com.jsp.Arrays;

public class RepeatedArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,1};
		int[] a1=new int[a.length*2];
		
		for(int i=0;i<a.length;i++)
		{
			a1[i]=a[i];
			a1[i+a.length]=a[i];
		}

		for(int s:a1)
		{
			System.out.print(s);
		}
	}
}
