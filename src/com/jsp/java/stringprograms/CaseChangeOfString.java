package com.jsp.java.stringprograms;

import java.util.Scanner;

public class CaseChangeOfString {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.nextLine();
		char[]a=s.toCharArray();
		String s1="";
		for(char c:a) {
			if(c>='A'&& c<='Z')
			{
				s1=s1+Character.toLowerCase(c);
			}
		
		else if(c>='a'&&c<='z')
		{
			s1=s1+Character.toUpperCase(c);
		} 
		else
			s1=s1+c;
		}
	
		System.out.println(s);
		System.out.println(s1);
	}
}
