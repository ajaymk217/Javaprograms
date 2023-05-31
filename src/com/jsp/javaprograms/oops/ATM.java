package com.jsp.javaprograms.oops;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		BankDetails cust1=new BankDetails();
		
		cust1.Pin=1021;
		cust1.Balance=20000;
		
		for( ; ; )
		{
		System.out.println("select your option");
		System.out.println("1 check balance\n"
				+"2 withSraw money\n"
				+"3 Deposite money\n");
		int i=scn.nextInt();
		
		if(i==1) 
		{
		
		cust1.CheckBalance();
		}
		if(i==2) 
		{
		System.out.println("enter withdraw amount");
		double amount=scn.nextDouble();
		cust1.WithDraw(amount);
		}
		if(i==3) 
		{
		System.out.println("entetr Deposite amount");
		double Deposite=scn.nextDouble();
		cust1.Deposite(Deposite);
		}
	  }
	}
}

class BankDetails
{
	double Balance;
	int Pin;
	
	public void CheckBalance()
	{
		System.out.println("your balance is =" +Balance);
		
	}
	public void WithDraw(double WithDraw)
	{
	if(Balance<WithDraw)
		
	{
		System.out.println("insufficent Balance");
	}
	else if(WithDraw%100!=0)
	{
		System.out.println("enter multpuls of 100 ");
	}
	else if(WithDraw>10000)
	{
		System.out.println("Withdraw limt 100000 only");
	}
	else
	{
		Balance=Balance-WithDraw;
		System.out.println(WithDraw+"withdrawn successfully");
		CheckBalance();
	 }
	}
	public void Deposite(double Deposite)
	{
		Balance=Balance+Deposite;
		CheckBalance();
	}
}
