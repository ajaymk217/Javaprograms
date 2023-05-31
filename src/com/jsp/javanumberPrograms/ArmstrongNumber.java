package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1 to find amstrongnumber enter 2 find amstrongnumbeinrange");
		
		int a=scn.nextInt();
		if(a==1) {
			System.out.println("enter to check wether the number is amstrong or not");
			int e=scn.nextInt();
			amstrong(e);
		}
		else {
			System.out.println("enter the number range");
			int s=scn.nextInt();
			int	e= scn.nextInt();
		amstrongNumberInRange(s,e);
		}
		
	}
	
	
	public static void amstrong(int a)
	{
		if(isamstrong(a))System.out.println(a);
	}
	
	public static void amstrongNumberInRange(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(isamstrong(i))System.out.println(i);
		}
	}
	
	
	public static boolean isamstrong(int a)
	{
		int count=0;
		int temp =a;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		a=temp;
		int sum=0;
		while(a>0)
		{
			int t=a%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*t;
			}
			sum=sum+prod;
			a=a/10;
			
		}
		return sum==temp;
		
		
	}

}
