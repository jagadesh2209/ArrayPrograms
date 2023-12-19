package com.jsp.Arrays;

import java.util.Scanner;

public class CreatingArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of on array");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("enter the Array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt()	;
		}
		System.out.println("enetr elements are:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
