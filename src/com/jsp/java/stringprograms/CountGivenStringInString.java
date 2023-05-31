package com.jsp.java.stringprograms;

import java.util.Scanner;

public class CountGivenStringInString {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		System.out.println("enter string to find");
		String s1=scn.nextLine();
		String s3="";
		int count=0;
		s3=s.replace(s1,"");
		count=s.length()-s3.length();
		count=count/s1.length();
		System.out.println(s1+" exist "+count+" times");
	}
}
