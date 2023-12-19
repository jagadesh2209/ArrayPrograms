package com.jsp.Arrays;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner( System.in);
		System.out.println("enter the number");
		int k=sc.nextInt();
		int count=0;
		int[] a= {3,12,36,35};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%k==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
