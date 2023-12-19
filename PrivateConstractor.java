package com.jsp.Arrays;

import java.util.function.Predicate;

interface AAA{
//	private AAA()
//	{
//		System.out.println("this is private");
//	}
//	public static AAA getInstance()
//	{
//		return new AAA();
//	}
	public abstract void m1();
	default void defaultMethod()
	{
		System.out.println("iam the default method this interface");
	}
	static void staticmethod()
	{
		System.out.println("iam the satatic method of this");
	}
}
public class PrivateConstractor implements AAA{

	public static void main(String[] args) {

//		AAA a = AAA.getInstance();
//		AAA a2 = AAA.getInstance();
//		System.out.println(a);
//		System.out.println(a2);
//		System.out.println(a==a2);
		
//		String[] arr= {"jaga","navee","maam"};
//		Predicate<Integer> p=e->e%2==0;
//		for(String obj:arr)
//		{
//			int length=obj.length();
//			if(p.test(length))
//			{
//				System.out.println(obj);
//			}
//		}
		
		PrivateConstractor p = new PrivateConstractor();
		p.m1();
		p.defaultMethod();
		AAA.staticmethod();
		
	}

	@Override
	public void m1() {
		System.out.println("iam the implementing method");
	}
 }
