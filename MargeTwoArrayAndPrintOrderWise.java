package com.jsp.Arrays;

public class MargeTwoArrayAndPrintOrderWise {

	public static void main(String[] args) {
		
		String[] s= {"10","20","30"};
		String[] s1= {"20","40","15"};
		int len=s.length+s1.length;
		System.out.println(len);
		
		String[] s3=new String[len];
		int i=0;
			for(int j=0;j<s.length;j++)
			{
				s3[i++]=s[j];
			}
			for(int k=0;k<s1.length;k++)
			{
				s3[i++]=s1[k];
			}
			
			m1(s3);
			for(int k=0;k<s3.length;k++)
			{
				System.out.print(s3[k]+" ");
			}
	}
	public static String[] m1(String[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

}
