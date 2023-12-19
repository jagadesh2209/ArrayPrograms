package com.jsp.Arrays;

public class DiffInTwoDimensianlArray {

	public static void main(String[] args) {

		int[][] a= {
				{2,3,4},
				{4,6,7},
				{7,8,9}};
		int sum=0;
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int k=a[i].length-1;
				if(i==0&&(j==0||j==k))
				{
					sum+=a[i][j];
				}
				if(i==a.length-1)
				{
					sum1+=a[i][j];
				}
			}
		}
		System.out.println(sum-sum1);
	}
}
