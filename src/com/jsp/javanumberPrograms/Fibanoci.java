package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class Fibanoci {

	public static void main(String[] args) {
		System.out.println("enter 2 number ");
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c =0;
		for(;true;) 
		{
			c=a+b;
			if(c>n) break;
			if(c>m) break;
			System.out.println(c);
			a=b;
			b=c;	
		}
	}
}
