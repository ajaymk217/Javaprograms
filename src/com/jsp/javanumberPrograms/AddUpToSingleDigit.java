package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class AddUpToSingleDigit {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int i=scn.nextInt();
		int temp=i;
		int sum=0;
		while(i>0||sum>9)
		{
			if(i==0)
			{
				i=sum;
				sum=0;
		}
			int t=i%10;
			sum=sum+t;
			i=i/10;
			
		}
		System.out.println(temp+""+sum);
	}
}
