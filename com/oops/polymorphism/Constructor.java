package com.oops.polymorphism;

public class Constructor {

	public Constructor() { //Default Constructor
		//this(20, 22); //Constructor chaining to call all constructor using 1  object
		System.out.println("Constructor - 1");
	}
	public Constructor(int a) {
		this();
		System.out.println("Constructor - 2");
	}
	public Constructor (int a, double b) {
		this(22);
		System.out.println("Constructor - 3");
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor(10, 20); //This will call Default constructor
		
		//Constructor obj2=new Constructor(1000); //This will call 2nd constructor
	}

}
