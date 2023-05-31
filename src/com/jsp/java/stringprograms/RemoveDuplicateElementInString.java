package com.jsp.java.stringprograms;

import java.util.Scanner;

public class RemoveDuplicateElementInString {
	public static void main(String[] args) {
		for(;;)
		{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string");
		String s =scn.nextLine();
		String s1=s;
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch= s1.charAt(i);
			if(s2.indexOf(ch)== -1) s2=s2+ch;
		}
			System.out.println(s2);
		}
	}
}
