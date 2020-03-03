
package com.surendra.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SOrtList {

	public static void main(String[] args) throws Exception {
		List<Integer> list = Arrays.asList(161,36,0,165,0,153);		
		
		List<Integer> failedList = new ArrayList<>();
		Exception ex = null;
		for(Integer x : list){
			try
			{
				System.out.println(100/x);
			}
			catch(Exception e)
			{
				failedList.add(x);
				ex = e;
			}
		}
		
		if(ex != null)
		{
			System.out.print(failedList);
			throw ex;

		}

	}
}
