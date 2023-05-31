package com.jsp.javanumberPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1 to find amstrongnumber enter 2 find amstrongnumbeinrange");
		
		int a=scn.nextInt();
		if(a==1) {
			System.out.println("enter to check wether the number is amstrong or not");
			int e=scn.nextInt();
			primeNumber(e);
		}
		else {
			System.out.println("enter the number range");
			int s=scn.nextInt();
			int	e= scn.nextInt();
			primeNumberInRange(s,e);
		}
		
	}
	private static void primeNumberInRange(int s, int e) {
		
	}
	private static void primeNumber(int e) {

		if(isPrime(e))System.out.println("is prime="+e);
		else System.out.println(e+"is not prime");
		
	}
	
	
	public static boolean isPrime(int c)
	{
		if (c<=1)return false;

		for(int i=2;i<=c/2;i++) {
		
				if(c%i==0)
				{
					return false;
				}
			}

		return true;
		}
}
