package com.jsp.Arrays;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the div Number");
		int n=sc.nextInt();
		System.out.println("enter the range ");
		int m=sc.nextInt();
		int sumE=0;
		int sumO=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				sumE+=i;
			}
			else {
				sumO+=i;
			}
		}
		System.out.println("sum of div by 4="+sumE);
		System.out.println("sum of not div by 4="+sumO);
		int dif=sumO-sumE;
		System.out.println("diff="+dif);
	}
}