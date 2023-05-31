package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter decimal numbers");
		int dec=scn.nextInt();
		int bin=0;
		int i=1;
		while(dec>0)
		{
			int b=dec%2;
			bin=bin+b*i;
			i=i*10;
			dec=dec/2;
		}
			System.out.println(bin);

	}
}
