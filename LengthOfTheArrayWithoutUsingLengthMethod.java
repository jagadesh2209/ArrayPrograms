package com.jsp.Arrays;

public class LengthOfTheArrayWithoutUsingLengthMethod {

	public static void main(String[] args) {
		
		int[] a= {0,2,3,6,5,48,7,9,2,5,9};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		//System.out.println(a.length);
	}

}
