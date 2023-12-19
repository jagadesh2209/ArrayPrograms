package com.jsp.Arrays;

public class MargeTwoIntElm {

	public static void main(String[] args) {
		int[] a = { 10, 2, 30, 50 };
		int[] b = { 20, 50, 60, 50 };
		int[] r = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			r[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			r[a.length + i] = b[i];
		}
		for (int t : r) {
			System.out.print(t + " ");
		}
	}
}
