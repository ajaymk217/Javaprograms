package com.jsp.javaprograms.oops;


public class ToString {


	public static void main(String[] args) 
	{
		car c=new car("black","lambo",2000);
		System.out.println(c);
		c.details();
	
	}
}
	class car{
		String colour;
		String brand;
		int price;
		public car(String colour,String brand,int price)
		{
			this.colour=colour;
			this.brand=brand;
			this.price=price;
		}
		public void details()
		{
			System.out.println("colour of the car is="+ colour);
			System.out.println("brand of the car is=" +brand);
			System.out.println("the car price is="+price);
			}
		public String toString()
		{
			return "colour="+colour+" ,brand="+brand+" ,price="+price;
		}
}
