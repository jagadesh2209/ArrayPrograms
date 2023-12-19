package com.jsp.Arrays;

public class Demo2 {

	public static void main(String[] args) 
	{
		String str="hello world";
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			boolean flog=true;
			if(arr[i]>='0' && arr[i]<='0')
			{
				continue;
			}
			for(int j=i+1;j<arr.length;i++)
			{
				if(arr[i]==arr[j])
				count++;
				arr[j]=(char) (count+'0');
				flog=false;
			}
			if(!flog) 
			{
				arr[i]='1';
			}
		}
		System.out.println(new String (arr));
	}

}
