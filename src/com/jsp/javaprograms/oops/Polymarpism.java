package com.jsp.javaprograms.oops;


public class Polymarpism {
	public static void main(String[] args) {
		Rider r=new Prorider();
		Bike b=new Pluser();
		r.rider(b);
	}

}
class Bike{
}
class Pluser extends Bike{
}
class Rider{
	public void rider(Bike b) {
		System.out.println("Bike rider");
	}
	public void rider(Pluser p) {
		System.out.println("pluser rider");
}
}
class Prorider extends Rider{
	public void rider(Bike b) {
		System.out.println("bike prorider");
	}
	public void rider(Pluser p) {
		System.out.println("pluser prorider");
}

}
