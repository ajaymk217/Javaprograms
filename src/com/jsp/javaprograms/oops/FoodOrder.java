package com.jsp.javaprograms.oops;

import java.util.Scanner;

public class FoodOrder {

	public static void main(String[] args)
	{
 System.out.println("welcome to restorent");
 System.out.println("please selec t chioce\n"
		 +"1.veg\n"
		 +"2.nonveg\n"
		 + "3.northyian");
         Scanner scn=new Scanner(System.in);
         int i=scn.nextInt();
         
         if (i==1)
         {
        	 food.order1();
        	 
         }

	}
}
class food 

{
	public static void order1()
	{
        Scanner scn=new Scanner(System.in);
   
		System.out.println("pls select items\n"
		+"1.idlee\n"
		+"2.puri");
	     int j=scn.nextInt();
		if(j==1)
		{
			System.out.println("pls enter plates");
			int n=scn.nextInt();
		int	idlee1=30;
		
		for(int i=1;i<=n;i++) 
		{
		int	t=i*idlee1;
		
		System.out.println(t);
		}
		System.out.println("do you continue");
	
		}
		
		else if(j==2)
		{
			System.out.println("enter plates");
			int m=scn.nextInt();
			int puri1=25;
			for(int i=1;i<=m;i++)
			{
				int r=i*puri1;
				System.out.println(r);
			}
		}
		
		}
	}
