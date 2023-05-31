package com.jsp.java.arrayprograms;

public class LargestElementinArray {

	public static void main(String[] args) {
		int []a= {5,8,2,3,4,5,6,7,1,9};
		int larg=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(larg<a[i])
			{
				larg=a[i];
			}
		}
		System.out.println(larg);

	}
}
