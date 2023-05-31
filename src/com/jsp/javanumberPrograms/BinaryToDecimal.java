package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter binary numbers");
		int bin=scn.nextInt();
		int dec=0;
		int i=1;
		while(bin>0)
		{
			int a=bin%10;
			dec=dec+a*i;
			i=i*2;
			bin=bin/10;
		}
		System.out.println(dec);

	}
	
}
