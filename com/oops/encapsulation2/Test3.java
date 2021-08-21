package com.oops.encapsulation2;

import com.oops.encapsulation.AccessModifiers;

public class Test3 extends AccessModifiers{

	public static void main(String[] args) {
	//	AccessModifiers obj=new AccessModifiers();
		Test3 obj2=new Test3();  	//new object of child class
		System.out.println(obj2.name);  		//Private:- not accessible
		System.out.println(obj2.age);		//Default:- not accessible
		System.out.println(obj2.address);	//Public
		System.out.println(obj2.salary);		//Protected:- not accessible
	}
}
