package com.oops.polymorphism;

public class Test2 {
	void show(long a) {
		System.out.println("long");
	}
	
	void show(int a) { //Argument
		System.out.println("int");
		
	}
	public static void main(String[] args) {
		Test2 obj=new Test2();
		obj.show(200L);
		obj.show(200); //Parameter
		
	}

}
