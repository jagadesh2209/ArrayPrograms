package com.jsp.Arrays;

public class ReverseTheArrayWithoutUsingExtraArray {

	public static void main(String[] args) {

		int[] a= {1,2,3,6,5,4};
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			i++;
		}
		
		for(int n:a)
		{
			System.out.print(n+" ");
		}	
	}
}
