package com.jsp.Arrays;

public class UniqElement {

	public static void main(String[] args) {

		int[] a= {1,1,2,2,2,3,4};
//		int[] b=new int[a.length];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]!=a[i+1])
//			{
//				b[i]=a[i];
//			}
//		}
//		for(int n:b)
//		{									//its pending
//			System.out.println(n);
//		}
		int[] b=new int[20];
		int index=0;
		for(int i=0;i<a.length;i++) 
		{
			int flage=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					flage=1;
					break;
				}
			}
			if(flage==0)
			{
				b[index]=a[i];
				index++;
			}
		}
		
		for(int i=0;i<index;i++)
		{
			System.out.print(b[index]+"");
		}

	}

}
