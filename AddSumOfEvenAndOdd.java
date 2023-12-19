package com.jsp.Arrays;

import java.util.Scanner;

public class AddSumOfEvenAndOdd {

	public static void main(String[] args) {

		int n,sumE=0,sumO=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size: ");
		n=sc.nextInt();
		int [] a=new int[n];// this is the size of the Array.
		System.out.println("enter the elements of the array:");//enter the elements based on the size of the array.
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sumE=sumE+a[i];//E means Even
			}
			else {
				sumO=sumO+a[i];//O means Odd
			}
		}
		System.out.println("Sum of Even Number:"+ sumE);
		System.out.println("Sum of Odd number :"+sumO);
	}
}
