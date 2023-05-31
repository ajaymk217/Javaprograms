package com.jsp.java.arrayprograms;

public class SecondSmallestArray {
	public static void main(String[] args) 
	{
		int []a= {5,8,2,3,4,5,6,7,1,9};
		int s=a[0];
		int s1=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s)
			{
				s1=s;
				s=a[i];
			}
			else if(a[i]<s1||s==s1)
			
			if(a[i]!=s) s1=a[i];
		}
		System.out.println(s1);
	
	}
}
