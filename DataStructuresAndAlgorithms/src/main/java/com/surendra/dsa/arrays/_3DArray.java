package com.surendra.dsa.arrays;

import static java.lang.System.out;

public class _3DArray {

	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int r = 0; r < a.length ; r ++)
		{
			for(int c = 0; c < a[0].length; c++)
			{
				out.println("a["+r+"]["+c+"]="+a[r][c]);
			}
		}
		
		
		int[][][] b = 
			{
					{ 
							{1,2,3}, 
							{4,5,6}, 
							{7,8,9}
					},
				
					{
							{1,2,3}, 
							{4,5,6},
							{7,8,9} 
					},
				
					{ 
							{1,2,3}, 
							{4,5,6}, 
							{7,8,9} 
					}
			};
		
		
		for(int r = 0; r < 3 ; r ++)
		{
			for(int c = 0; c < 3; c++)
			{
				for(int h = 0; h < 3; h++)
				{
					out.println("b["+r+"]["+c+"]["+h+"]=" + b[r][c][h]);
				}
			}
		}
		
		
	}
}
