package com.jsp.java.stringprograms;

import java.util.Scanner;

public class DividStringIntoNEqualPart {


	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to divid into n equal part");
		String s=scn.next();
		int temp=0;
		System.out.println("enter numer of parts");
		int n=scn.nextInt();
		int n1=s.length()/n;
		String [] ar=new String[n];
		if(s.length()%n!=0) {
			System.out.println("entred string cant divided into "+n+" parts");
			return;
		}
		else
			for(int i=0;i<s.length();i=i+n1)
		{
			String s1=s.substring(i, i+n1);
			ar[temp]=s1;
			temp++;
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		

	}
}
