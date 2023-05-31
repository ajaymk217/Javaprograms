package com.jsp.java.stringprograms;

import java.util.Scanner;

public class ReversStringCentance {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String s1=" ";
		String [] arr=s.split(" ");
		int j=arr.length-1;
		for(int i=j;i>=0;i--)
		{
			s1=s1+arr[i];
			s1=s1+" ";	
			
		}
		s1.trim();
		System.out.println(s1);
	}
}
