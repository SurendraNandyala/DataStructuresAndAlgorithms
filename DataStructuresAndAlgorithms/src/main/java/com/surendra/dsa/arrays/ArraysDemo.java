package com.surendra.dsa.arrays;

import static java.lang.System.out;

public class ArraysDemo {
	public static void main(String args[])
	{
		int a[] = new int[] {1,2,3,4,5,6,7,8,9,0};
		out.println(a.toString());
		out.println(a[0]);
		
		for(int x : a)
		{
			out.println(x);
		}
	}
}
