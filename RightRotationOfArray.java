package com.jsp.Arrays;

import java.util.Scanner;

public class RightRotationOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int k=sc.nextInt();
		int[] a= {2,3,6,5,9,8,7};
		
		int n=k%a.length;
		for(int i=n+1;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		for(int j=0;j<=n;j++)
		{
			System.out.print(a[j]);
		}
		System.out.println();
	}
}