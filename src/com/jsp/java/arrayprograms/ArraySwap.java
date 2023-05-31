package com.jsp.java.arrayprograms;

import java.util.Arrays;

public class ArraySwap {


	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		swap(a);
		System.out.println(Arrays.toString(a));
	}
		

	public static void swap(int[]a)
	{
		int i=0,j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}

	}
}
