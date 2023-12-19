package com.jsp.Arrays;
class A{
	public static  void m()
	{
		System.out.println("Hai iam the first method");
	}
	public static void m(int a)
	{
		System.out.println("its second method");
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {

		A a = new A();
		a.m(0);
	} 

}
