package com.jsp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NthBiggestNumberInArray {

	public static void main(String[] args) {

		int[] a= {1,2,55,6,8,3,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int n=sc.nextInt();
		System.out.println(m1(a, n));
		
		
	}
	
	public static int m1(int[] a,int n)
	{
		int temp=0;
		if(n>0&&n<a.length)
		{
			Arrays.sort(a);
			return a[a.length-n];
		}
		else {
			System.out.println("Invalid number");
			return -1;
		}
	}

}
