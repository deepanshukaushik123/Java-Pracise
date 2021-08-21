package com.oops.polymorphism;
/*
 * OverLoading:-
 * Same meathod name
 * no. of parameter
 * Different data types
 * order of parameter
 */
class test {
	//Signature
	// Access_modifiers return_type meathod_name no_of_Parameters
	void display() {
		System.out.println("abc");
	}
	void show() {
		
	}
	
	void show(int a) {
		
	}
	
	void show(String a) {
		
	}
	
	void show(int a, String b) {
	
}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		
		test obj=new test();
		obj.show(0);
		obj.show(null);
		obj.show(0, null);
		obj.display();
		
	}
}

