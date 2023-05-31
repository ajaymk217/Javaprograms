package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int a =scn.nextInt();
		int temp=a;
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			sum=sum+r;
			a=a/10;
			
		}
		int temp1=sum;
		int reve=0;
		while(sum>0)
		{
			int rem=sum%10;
			reve=reve*10+rem;
			sum=sum/10;
			
		} 
		if(temp1*reve==temp)
		{
			System.out.println("its magic number");
		}
		else
			System.out.println("not an magic number");
		
	}
}
