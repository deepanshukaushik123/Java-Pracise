package com.oops.polymorphism;

import java.util.Scanner;

class Parent {
	void show() {
		System.out.println("p-show");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("c-show");
	}
	
}
public class OverridingDemo {

	public static void main(String[] args) {
		Child obj=new Child();
		 obj.show();
	}

}
