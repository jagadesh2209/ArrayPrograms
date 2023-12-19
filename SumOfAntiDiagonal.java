package com.jsp.Arrays;

public class SumOfAntiDiagonal {

	public static void main(String[] args) {
		int[][] a= {
				{2,3,6},
				{3,6,9},
				{9,8,7}
			};
		int len=a.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=a[i][i];
			if(len%2!=0&&i==len/2) continue;
			sum+=a[i][len-1-i];
		}
		System.out.println(sum);
	}
}
