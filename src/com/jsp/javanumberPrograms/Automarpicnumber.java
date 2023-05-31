package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class Automarpicnumber {
	public static int power(int base,int exp)
	{
		int p=1;
		for(int i=1;i<=exp;i++)
		{
			p=p*base;
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");	
		int num=scn.nextInt();
		int temp=num;
		int len=0;
		int squr=power(num,2);
		while(num>0)
		{
			len++;
			num=num/10;
			
		}
		int result=squr%power(10,len);
		if(result==temp)
		{
			System.out.println("its automarphic");
		}
		else
			System.out.println("not automarphic");
	}

}
