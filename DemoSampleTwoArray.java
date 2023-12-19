package com.jsp.Arrays;

public class DemoSampleTwoArray{
public static void main(String[] args)
{
  int[][] a=new int[3][];
  a[0]=new int[5];
  a[1]=new int[4];
  a[2]=new int[3];
  for(int[] temp:a)
  {
	  for(int n:temp) 
	  {
	  	System.out.print(n+"\t"); 
	  }
	  System.out.println();
  }
}
}
