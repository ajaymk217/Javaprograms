package com.jsp.java.stringprograms;

import java.util.Scanner;

public class StringRivers {

	public static void main(String[] args) 
	{
		System.out.println("enter string");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String s1="";
		String[] a=s.split(" ");
		for(String str:a)
		{
			s1=s1+revers(str);
			s1+=" ";
		}
		s1.trim();
		System.out.println(s1);
		

	}

	public static String revers(String s) 
	{
		int i=0,j=s.length()-1;
		char []a =s.toCharArray();
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		
		return  new String(a); 
	}
}
