package com.jsp.java.stringprograms;

import java.util.Scanner;

public class AlphaNumaric {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("enter alphanumeric string");
		String s=scn.nextLine();
		char[] c=s.toCharArray();
		
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0'&&c[i]<='9')
			{
			sum+=c[i]-'0';
			}
		}
		System.out.println(sum);

	}
}
