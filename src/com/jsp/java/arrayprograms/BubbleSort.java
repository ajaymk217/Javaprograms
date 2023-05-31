package com.jsp.java.arrayprograms;

public class BubbleSort {
	public static void main(String[] args) {

		int [] a= {2,3,5,7,9,4,1};
		sort(a);
		for(int i:a) {
			System.out.println(i);
		}
	}

	private static void sort(int[] a) {

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j+1]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
	}
}
