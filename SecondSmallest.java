package com.jsp.Arrays;

public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		int [] a= {1,0,5,45,12,5,8,54};
	
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==s1)
			{
				continue;
			}
			else if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2||s1==s2)
			{
				s2=a[i];
			}
		}
		//we want to add least of two numbers in given array then we add the s1+s2.  . 
	System.out.println(s1+" is the Smallest Number in given Array");
	System.out.println(s2+" is the second Smallest Number in given Array");
	
	}
	
}
