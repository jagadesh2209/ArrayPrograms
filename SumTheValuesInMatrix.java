package com.jsp.Arrays;

public class SumTheValuesInMatrix {

	public static void main(String[] args) 
	{
		int[][] a= {
				{1,3,2},//1+3+2=6
				{6,5,4},//6+5+4=15+6=21
				{9,8,7}//9+8+7=24+21=45
		};
		int sum=0;// if we want to multiply we use the * operator and sum=1
		for(int[]temp:a)
		{
			for(int n:temp)
			{
				sum+=n;
			}
			System.out.println(sum);
		}
	}
}
