package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class LcmOfTwoNumber {
	public class LcmofTwonumber {
		public static void main(String[] args) {
			int max,step,lcm=0,a,b;
			Scanner scn=new Scanner (System.in);
			System.out.println("enter 2 number");
			a=scn.nextInt();
			b=scn.nextInt();
			if(a>b)
			{
				max=step=a;
			}
			else
				max=step=b;
			while (a!=0)
			{
				if(max%a==0 && max%b==0) 
				{
				lcm=max;
				break;
				}
				max+=step;
			}
			
			System.out.println(lcm);
					
		}

	}
}
