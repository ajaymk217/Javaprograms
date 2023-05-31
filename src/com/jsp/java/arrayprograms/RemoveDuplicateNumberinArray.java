package com.jsp.java.arrayprograms;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateNumberinArray {
	public static void main(String[] args) 
	{
		int []a= {5,8,2,3,4,5,6,7,1,9,2,3,4};
		System.out.println("original array"+Arrays.toString(a));
//		int []result =removeDuplicates(a);
		int []result =rempveDuplicateElements(a);
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] removeDuplicates(int[] a) {
		
		HashSet<Integer> uniqueSet = new HashSet<>();
		for(int num:a)
		{
			uniqueSet.add(num);
		}
		int index=0;
		int [] result=new int[uniqueSet.size()];
		for(int arr:uniqueSet) {
			result[index++]=arr;
		}
		
		return result;
	}
	public static int[] rempveDuplicateElements(int [] a) {
		
		int n=a.length;
		int[] uniqArray=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				uniqArray[count++]=a[i];
			}
		}
		int[] result =new int [count];
		System.arraycopy(uniqArray, 0, result, 0, count);
		return result;
		
	}
}
