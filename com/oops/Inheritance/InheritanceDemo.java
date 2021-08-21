package com.oops.Inheritance;

import java.util.Scanner;

class GrandParent {
	void delete() {
		System.out.println("G-Parent");
	}
}

class Parent extends GrandParent{
	public Parent () {
		System.out.println("p-constructor");
	}
	int age=30;
	void show() {
		System.out.println("Parent 1");
	}
	void display() {
		System.out.println("Parent 2");
	}
}
class child extends Parent {
	void people(){
		System.out.println("parent1 + parent2");
	}
	public child() {
		System.out.println("c-constructor");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		child obj=new child();
		System.out.println(obj.age);
		obj.show();
		obj.display();
		obj.people();
		obj.delete();
		

	}

}
