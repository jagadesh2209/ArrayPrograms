package com.jsp.Arrays;
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		int [] a= {10,20,50,60,20,60};
		Arrays.sort(a);
		int len=a.length;
		len=remove(a,len);
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}  
	public static int remove(int[]a,int size)
	{
		if(size==0||size==1)
		{
			return size;
		}
		int[] temp=new int[size];
		int j=0;
		for(int i=0;i<size-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[size-1];
		for(int i=0;i<j;i++)
		{
			a[i]=temp[i];	
		}
		return j;
	}
}
