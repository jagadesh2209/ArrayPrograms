package com.jsp.Arrays;

public class SumOfDiagnal {

	public static void main(String[] args) 
	{
		int[][]a= {
				{9,2,3},
				{6,12,6},
				{9,8,1}
		};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
		 }
		System.out.println("sum="+sum);
	}
}
